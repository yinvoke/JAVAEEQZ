package com.hnu.yzw.controlimpl;


import com.hnu.yzw.model.User;


/**
 * jdbc，用户基础功能的数据库连接系统
 */
public interface UserDbc {
    /**
     * 根据用户名和密码查询用户信息
     * @param uname 用户名
     * @param pwd	密码
     * @return 返回查询到的用户信息
     */
    User queryMessage(String uname, String pwd);

    /**
     * 根据用户ID修改用户密码
     * @param newPwd
     * @param uid
     * @return
     */
    int updateMessage(String newPwd, int uid);

    /**
     * 用户注册
     * @param u
     * @return
     */
    int registerUser(User u);
}
