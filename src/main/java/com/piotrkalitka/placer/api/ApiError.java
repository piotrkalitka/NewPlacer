package com.piotrkalitka.placer.api;

import org.springframework.http.HttpStatus;

public class ApiError {

    private int code;
    private HttpStatus status;
    private String message;

    public ApiError(HttpStatus status, String message) {
        this.code = status.value();
        this.status = status;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
