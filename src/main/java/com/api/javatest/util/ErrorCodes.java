package com.api.javatest.util;

public enum ErrorCodes {

    USER_NOT_FOUND("404", "User Not Found"),
    APPLICATION_ERROR("400", "Application is down");

    private final String code;
    private final String message;

    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
