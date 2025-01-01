package com.api.javatest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.javatest.entity.User;
import com.api.javatest.exception.UserNotFound;
import com.api.javatest.repo.UserRepo;
import com.api.javatest.request.Request;
import com.api.javatest.util.Mapper;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User save(Request request){
        return repo.save(Mapper.requestBuilder(request));
    }

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findOne(Long id) {
        Optional<User> byId = repo.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new UserNotFound("User Not Found");
        }
    }

}
