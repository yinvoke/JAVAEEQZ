package com.hnu.yzw.com.hnu.yzw.control;

import com.hnu.yzw.controlimpl.UserDbc;
import com.hnu.yzw.controlimpl.UserService;
import com.hnu.yzw.model.User;


/**
 * 用户基础功能服务，用于进行数据转发初步处理，连接servlet和jdbc控制器
 */
public class MyUserService implements UserService {
    //声明Dbc层对象
    UserDbc userDbc = new MyUserDbc();

    //用户登录
    @Override
    public User checkService(String uname, String pwd) {
        //打印日志
        User user = userDbc.queryMessage(uname, pwd);
        //判断
        if(user!=null){
            System.out.print(uname+"登录成功");
        }else{
            System.out.print(uname+"登录失败");
        }
        return user;
    }

    //修改用户密码
    @Override
    public int updateMessageService(String newPwd, int uid) {
        System.out.print(uid+":发起密码请求");
        int index = userDbc.updateMessage(newPwd,uid);
        if(index>0){
            System.out.print(uid+":密码修改成功");
        }else{
            System.out.print(uid+":密码修改失败");
        }
        return index;
    }


    //用户注册
    @Override
    public int registerUserService(User u) {
        return userDbc.registerUser(u);
    }

}
