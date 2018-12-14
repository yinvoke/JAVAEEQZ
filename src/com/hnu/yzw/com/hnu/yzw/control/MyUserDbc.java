package com.hnu.yzw.com.hnu.yzw.control;

import com.hnu.yzw.controlimpl.UserDbc;
import com.hnu.yzw.model.User;

import java.sql.*;


/**
 * jdbc，用户基础功能的数据库连接系统
 */
public class MyUserDbc implements UserDbc {
    //定义基础数据
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String USERNAME = "root";
    static final String USERPASSWORD = "root";
    static final String URL = "jdbc:mysql://127.0.0.1:3306/home";

    //根据用户名和密码查询用户信息
    @Override
    public User queryMessage(String uname, String pwd) {
        //声明jdbc对象
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        //声明变量
        User u=null;
        try {
            //加载驱动
            Class.forName(DRIVER);
            //获取连接
            conn= DriverManager.getConnection(URL,USERNAME, USERPASSWORD);
            //创建sql命令
            String sql="select * from users where u_name = ? and u_pwd = ?";
            //创建sql命令对象
            ps=conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1, uname);
            ps.setString(2, pwd);
            //执行sql
            rs=ps.executeQuery();
            //遍历结果
            while(rs.next()){
                //给变量赋值
                u=new User();
                u.setU_id(rs.getInt("u_id"));
                u.setU_name(rs.getString("u_name"));
                u.setU_pwd(rs.getString("u_pwd"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //关闭资源
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //返回结果
        return u;
    }

    //根据用户ID修改用户密码
    @Override
    public int updateMessage(String newPwd, int uid) {
        //声明jdbc对象
        Connection conn=null;
        PreparedStatement ps=null;
        //创建变量
        int index=-1;
        try {
            //加载驱动
            Class.forName(DRIVER);
            //获取连接
            conn= DriverManager.getConnection(URL,USERNAME, USERPASSWORD);
            //创建SQL命令
            String sql="update users set u_pwd=? where u_id=?";
            //创建SQL命令对象
            ps=conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1, newPwd);
            ps.setInt(2, uid);
            //执行
            index=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{//关闭资源
            //关闭资源
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //返回结果
        return index;
    }


    //用户注册
    @Override
    public int registerUser(User u) {
        //声明jdbc对象
        Connection conn=null;
        PreparedStatement ps=null;
        //声明变量
        int index=-1;
        try {
            //加载驱动
            Class.forName(DRIVER);
            //获取连接
            conn= DriverManager.getConnection(URL,USERNAME, USERPASSWORD);
            //创建SQL命令
            String sql="insert into users(u_name,u_pwd) values(?,?)";
            //创建SQL命令对象
            ps=conn.prepareStatement(sql);
            //给占位符赋值
            ps.setString(1,u.getU_name());
            ps.setString(2,u.getU_pwd());
            //执行
            index=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{//关闭资源
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //返回结果
        return index;
    }
}
