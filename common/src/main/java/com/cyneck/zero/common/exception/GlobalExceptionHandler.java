package com.cyneck.zero.common.exception;

import com.cyneck.zero.common.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.exception
 * @Description : 全局异常捕获
 * @Create on : 2019/5/8 15:48
 **/

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    ApiResponse handleException(Exception e) {
        LOGGER.error(e.getMessage(), e);
        ApiResponse response = new ApiResponse();
        response.setMessage("操作失败！");
        return response;
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    ApiResponse handleBusinessException(BusinessException e) {
        LOGGER.error(e.getMessage(), e);
        ApiResponse response = new ApiResponse();
        response.setMessage(e.getMessage());
        return response;
    }
}
