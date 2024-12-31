package com.api.javatest.response;

import java.util.HashMap;
import java.util.Map;

import com.api.javatest.entity.User;

public class Response {

    String name;
    String email;
    Long mobile;
    Map<String, String> error = new HashMap<>();
    public Response() {
    }

    
    public Response(String name, String email, Long mobile, Map<String, String> error) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.error = error;
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
    public Map<String, String> getError() {
        return error;
    }
    public void setError(Map<String, String> error) {
        this.error = error;
    }
    @Override
    public String toString() {
        return "Response [name=" + name + ", email=" + email + ", mobile=" + mobile + ", error=" + error + "]";
    }
}
