package com.hwadmin.service;

import com.hw.domain.SysUser;

public interface UserService {

    /**
     * 根据登录名获取用户
     * @param loginName 登录名
     * @return
     */
    public SysUser getUserByLoginName(String loginName);

}
