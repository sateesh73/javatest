package com.api.javatest.request;

import com.api.javatest.entity.User;

public class Request {
    String name;
    String email;
    Long mobile;
    public Request() {
    }
    public Request(String name, String email, Long mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getMobile() {
        return mobile;
    }
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "request [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
    }
    
}
