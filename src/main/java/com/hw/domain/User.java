package com.hw.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="APP_USER")
public class User {
    @Id @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="username",unique = true)
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="createdate")
    private Date createdate;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="APP_USER_ID", referencedColumnName="ID")
    private List<UserRole> roles;

    public User() { }

    public User(Long id, String username, String password, List<UserRole> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }
}

