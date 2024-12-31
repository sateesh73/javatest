package com.api.javatest.controller;

import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.javatest.entity.User;
import com.api.javatest.request.Request;
import com.api.javatest.response.Response;
import com.api.javatest.service.UserService;
import com.api.javatest.util.Mapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/save")
    public ResponseEntity<Response> save(@RequestBody Request request) {
        Response res = Mapper.responseBuilder(service.save(request));
        return new ResponseEntity<Response>(res, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Response>> findAll() {
        List<User> all = service.findAll();
        List<Response> res = all.stream().map(data->Mapper.responseBuilder(data)).toList();
        return new ResponseEntity<List<Response>>(res, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getMethodName(@PathVariable Long id) {
        Response res = Mapper.responseBuilder(service.findOne(id));
        return new ResponseEntity<Response>(res, HttpStatus.OK);
    }
    

}
