package com.hw.security.model;

/**
 * Created by pandehua on 2017/6/27.
 */
public enum Scopes {
    REFRESH_TOKEN;

    public String authority() {
        return "ROLE_" + this.name();
    }
}