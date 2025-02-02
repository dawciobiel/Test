package com.example.xCodeRestApi.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InvalidValueTypeExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(InvalidValueTypeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String InvalidValueHandler(InvalidValueTypeException ex)
    {
        return ex.getMessage() ;
    }
}
