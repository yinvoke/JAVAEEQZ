package com.hnu.yzw.controlimpl;

import com.hnu.yzw.model.OM;

import java.util.List;


/**
 * jdbc，用户拓展功能的数据库连接系统
 */
public interface OtherDbc {
    /**
     * 补全信息
     * @param o 其余信息集合
     * @return
     */
    int fixAllMessage(OM o);

    /**
     * 获取所有的用户信息
     * @return 信息集合
     */
    List<OM> getAllUsers();
}
