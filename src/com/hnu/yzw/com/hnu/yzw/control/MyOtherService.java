package com.hnu.yzw.com.hnu.yzw.control;


import com.hnu.yzw.controlimpl.OtherDbc;
import com.hnu.yzw.controlimpl.OtherService;
import com.hnu.yzw.model.OM;

import java.util.List;


/**
 * 用户拓展功能服务，用于进行数据转发初步处理，连接servlet和jdbc控制器
 */
public class MyOtherService implements OtherService {
    //声明Dbc层对象
    OtherDbc otherDbc = new MyOtherDbc();

    //补充信息
    @Override
    public int fixAllMessageService(OM o){
        return otherDbc.fixAllMessage(o);
    }


    //获取所有的用户信息
    @Override
    public List<OM> getAllUsersService() {
        List<OM> lu = otherDbc.getAllUsers();
        return lu;
    }
}
