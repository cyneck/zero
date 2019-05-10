package com.cyneck.zero.common.exception;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.exception
 * @Description : 业务异常定义
 * @Create on : 2019/5/8 15:48
 **/
public class BusinessException extends RuntimeException {
    public BusinessException(String message){
        super(message);
    }
}
