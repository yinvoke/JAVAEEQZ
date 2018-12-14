package com.hnu.yzw.controlimpl;

import com.hnu.yzw.model.OM;

import java.util.List;


/**
 * 用户拓展功能服务，用于进行数据转发初步处理，连接servlet和jdbc控制器
 */
public interface OtherService {
    /**
     * 补全信息
     * @param o 其余信息
     * @return
     */
    int fixAllMessageService(OM o);

    /**
     * 获取所有的用户信息
     * @return 信息集合
     */
    List<OM> getAllUsersService();
}
