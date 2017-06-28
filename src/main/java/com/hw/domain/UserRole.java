package com.hw.domain;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROLE_ID")
    private int role_id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE")
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
