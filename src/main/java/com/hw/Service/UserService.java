package com.hw.Service;

import com.hw.domain.User;

import java.util.Optional;

/**
 * Created by pandehua on 2017/6/27.
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}