package com.hwadmin.service;

import com.hw.domain.UserInfo;

public interface UserService {

    /**
     * 根据登录名获取用户
     * @param loginName 登录名
     * @return
     */
    public UserInfo getUserByLoginName(String loginName);

}
