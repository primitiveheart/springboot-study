package com.example.demo.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2018/1/15.
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {
    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request, GlobalErrorInfoException exception){
        ErrorInfoInterface errorInfoInterface = exception.getErrorInfoInterface();
        ResultBody resultBody = new ResultBody(errorInfoInterface);
        return  resultBody;
    }
}
