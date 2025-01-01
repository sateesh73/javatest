package com.api.javatest.advise;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.api.javatest.exception.UserNotFound;
import com.api.javatest.response.Response;
import com.api.javatest.util.ErrorCodes;

@RestControllerAdvice
public class UserAdvice {

    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<Response> handleUserNotFound(UserNotFound ex){
        Response res = new Response();
        Map<String, String> error = new HashMap<>();
        error.put(ErrorCodes.USER_NOT_FOUND.getValue(), ex.getMessage());
        res.setError(error);
        return new ResponseEntity<Response>(res, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleUserException(Exception ex){
        Response res = new Response();
        Map<String, String> error = new HashMap<>();
        error.put(ErrorCodes.APPLICATION_ERROR.getValue(), ex.getMessage());
        res.setError(error);
        return new ResponseEntity<Response>(res, HttpStatus.NOT_FOUND);
    }

}
