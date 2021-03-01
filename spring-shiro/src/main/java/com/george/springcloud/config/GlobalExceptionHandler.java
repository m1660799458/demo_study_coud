package com.george.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@Slf4j
public class GlobalExceptionHandler {

//    @ExceptionHandler(BindException.class)
//    public Object validExceptionHandler(BindException e) {
//        FieldError fieldError = e.getBindingResult().getFieldError();
//        assert fieldError != null;
//        log.error(fieldError.getField() + ":" + fieldError.getDefaultMessage());
//        // 将错误的参数的详细信息封装到统一的返回实体
//        return fieldError.getField() + ":" + fieldError.getDefaultMessage();
//    }


    @ExceptionHandler
    @ResponseBody
    public String ErrorHandler(AuthorizationException e) {
        log.error("没有通过权限验证！", e);
        return "没有通过权限验证！";
    }


}