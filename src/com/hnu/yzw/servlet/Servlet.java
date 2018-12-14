package com.hnu.yzw.servlet;

import com.hnu.yzw.com.hnu.yzw.control.MyOtherService;
import com.hnu.yzw.controlimpl.OtherService;
import com.hnu.yzw.controlimpl.UserService;
import com.hnu.yzw.com.hnu.yzw.control.MyUserService;
import com.hnu.yzw.model.OM;
import com.hnu.yzw.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/***
 * Servlet 用于联系浏览器和后台，进行数据的转发
 */
public class Servlet extends HttpServlet {
    //获取service层对象
    UserService us = new MyUserService();
    OtherService os = new MyOtherService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //        //设置响应编码格式
        response.setContentType("text/html;charset = utf-8");
        //获取操做符
        String oper = request.getParameter("oper");
        if("login".equals(oper)){
            //调用登录处理方法
            checkUserLogin(request,response);
        }else if("out".equals(oper)){
            //调用退出功能
            exitUser(request,response);
        }else if("pwd".equals(oper)){
            //调用密码修改功能
            userChangePwd(request,response);
        }else if("show".equals(oper)){
            //调用显示所有用户功能
            userShow(request,response);
        }else if("reg".equals(oper)){
            //调用注册功能
            userReg(request,response);
        }else if("bq".equals(oper)){
            //调用补全功能
            buQuan(request,response);
        }else if("mine".equals(oper)){
            //个人信息功能
            aUser(request,response);
        }else{
            System.out.print("没有找到对应的操作符："+oper);
        }
    }

    //注册用户
    private void userReg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取请求信息
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        //处理请求信息
        User u = new User(0, uname, pwd);
        //调用业务层处理
        int index = us.registerUserService(u);
        //响应处理结果
        if(index>0){
            //获取session
            HttpSession hs = request.getSession();
            hs.setAttribute("reg", "true");
            //重定向
            response.sendRedirect("index.jsp");
        }
    }

    //补全信息
    private void buQuan(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //获取请求信息
        int uid = ((User)request.getSession().getAttribute("user")).getU_id();
        String uname = ((User)request.getSession().getAttribute("user")).getU_name();
        String usex = request.getParameter("sexs");
        int uage = Integer.parseInt(request.getParameter("uage"));
        String uqq = request.getParameter("uqq");
        String uwname = request.getParameter("wname");
        double uwsalary = Double.parseDouble(request.getParameter("wsalary"));
        String uhlocation = request.getParameter("hlocation");
        double uhsize = Double.parseDouble(request.getParameter("hsize"));
        String ucname = request.getParameter("cname");
        double ucprice = Double.parseDouble(request.getParameter("cprice"));
        //处理请求信息,调用业务层处理
        OM o = new OM(uid,uname,usex,uage,uqq,uwname,uwsalary,uhlocation,uhsize,ucname,ucprice);
        int index = os.fixAllMessageService(o);
        //响应处理结果
        if(index>0){
            //获取session
            HttpSession hs = request.getSession();
            hs.setAttribute("bq", "true");
            //重定向
            response.sendRedirect("right.jsp");
        }
    }

    //显示所有的用户信息
    private void userShow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理请求
        //调用service
        List<OM> lo = os.getAllUsersService();
        //判断
        if(lo != null){
            //request
            request.setAttribute("lo",lo);
            //请求转发
            request.getRequestDispatcher("showmessages.jsp").forward(request, response);
            return;
        }
    }

    //显示个人信息
    private void aUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理请求
        //调用service
        List<OM> lo = os.getAllUsersService();
        List<OM> nlo = new ArrayList<OM>();
        User u = (User)request.getSession().getAttribute("user");
        String u_name = u.getU_name();
        for (OM o:lo) {
            if(o.getUname().equals(u_name)){
              nlo.add(o);
            }
        }
        //判断
        if(nlo != null){
            //request
            request.setAttribute("nlo",nlo);
            //请求转发
            request.getRequestDispatcher("showmessage.jsp").forward(request, response);
            return;
        }
    }

    //用户修改密码
    private void userChangePwd(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
        //获取数据
        String newPwd  =  request.getParameter("newPwd");
        //从session中获取用户信息
        User u = (User)request.getSession().getAttribute("user");
        int uid = u.getU_id();
        String oldPwd = u.getU_pwd();
        if(oldPwd.equals(request.getParameter("oldPwd"))){
            //处理请求
            //调用service处理
            int index  =  us.updateMessageService(newPwd,uid);
            if(index>0){
                //获取session对象
                HttpSession hs  =  request.getSession();
                hs.setAttribute("pwd","true");
                //重定向到登录页面
                response.sendRedirect("right.jsp");
            }
        }
        else{
            //添加标识符到request中
            request.setAttribute("fixflag",0);
            //请求转发
            request.getRequestDispatcher("fixpwd.jsp").forward(request, response);
            return;
        }
    }

    //用户退出
    private void exitUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取session对象
        HttpSession hs  =  request.getSession();
        //强制销毁session
        hs.invalidate();
        //重定向到登录页面
        response.sendRedirect("index.jsp");
    }

    //处理登录
    private void checkUserLogin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //获取请求信息
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        System.out.println("name:"+uname+"  pwd:"+pwd);
        //处理请求信息
        //校验
        User u = us.checkService(uname, pwd);
        if(u != null){
            //获取session对象
            HttpSession hs  =  request.getSession();
            //将用户数据存储到session中
            hs.setAttribute("user", u);
            //重定向
            response.sendRedirect("main.jsp");
            return;
        }else{
            //添加标识符到request中
            request.setAttribute("flag",0);
            //请求转发
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }
    }

}
