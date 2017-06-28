package com.hw.domain;

/**
 * Created by pandehua on 2017/6/27.
 */
public enum Role {
    ADMIN, PREMIUM_MEMBER, MEMBER,BANKPAY;

    public String authority() {
        return "ROLE_" + this.name();
    }
}
