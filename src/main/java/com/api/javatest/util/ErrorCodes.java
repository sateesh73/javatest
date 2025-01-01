package com.api.javatest.util;

public enum ErrorCodes {

    USER_NOT_FOUND("404"),
    APPLICATION_ERROR("400");

    private final String code;

    ErrorCodes(String code) {
        this.code = code;
    }

    public String getValue() {
        return code;
    }
}
