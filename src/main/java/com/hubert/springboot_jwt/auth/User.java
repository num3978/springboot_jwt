package com.hubert.springboot_jwt.auth;

/**
 * Created by Hubrt on 2017/9/12.
 */
public class User {
    private String loginName;

    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
