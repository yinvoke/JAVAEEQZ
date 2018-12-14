package com.hnu.yzw.controlimpl;

import com.hnu.yzw.model.User;

/**
 * 用户基础功能服务，用于进行数据转发初步处理，连接servlet和jdbc控制器
 */

public interface UserService {
    /**
     * 校验用户登录
     * @param uname 用户名
     * @param pwd	密码
     * @return	返回查询到的用户信息
     */
    User checkService(String uname, String pwd);

    /**
     * 修改用户密码
     * @param newPwd
     * @param uid
     * @return
     */
    int updateMessageService(String newPwd, int uid);


    /**
     * 用户注册
     * @param u
     * @return
     */
    int registerUserService(User u);
}
