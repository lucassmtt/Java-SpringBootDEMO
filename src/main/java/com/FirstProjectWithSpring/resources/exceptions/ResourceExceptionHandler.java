package com.FirstProjectWithSpring.resources.exceptions;

import com.FirstProjectWithSpring.services.exceptions.DatabaseException;
import com.FirstProjectWithSpring.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException exception, HttpServletRequest request) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError customError = new StandardError(Instant.now(), status, error, exception.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(customError);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> resourceCantDelete(DatabaseException exception, HttpServletRequest request) {
        String error = "Resource can`t delete";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError databaseError = new StandardError(Instant.now(), status, error, exception.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(databaseError);
    }
}
