package com.hw.Dao;


import org.springframework.data.repository.CrudRepository;

import com.hw.domain.UserInfo;

public interface UserDao extends CrudRepository<UserInfo, Integer>{
	UserInfo findUserInfoByName(String name);
}
