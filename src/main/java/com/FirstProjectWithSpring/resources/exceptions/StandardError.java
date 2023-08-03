package com.FirstProjectWithSpring.resources.exceptions;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Instant moment;
    private Integer statusCode;
    private String error;
    private String message;
    private String path;

    public StandardError(){}

    public StandardError(Instant moment, Integer statusCode, String error, String message, String path) {
        super();
        this.moment = moment;
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
