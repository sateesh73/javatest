package com.api.javatest.util;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.api.javatest.entity.User;
import com.api.javatest.request.Request;
import com.api.javatest.response.Response;

@Component
public class Mapper {

    public static User requestBuilder(Request request) {
        return new User(request.getName(), request.getEmail(), request.getMobile());
    }

    
    public static Response responseBuilder(User user){
        return new Response(user.getName(), user.getEmail(), user.getMobile(), new HashMap<String,String>());
    }

}
