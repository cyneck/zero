package com.cyneck.zero.common.api;

import com.cyneck.zero.common.model.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.api
 * @Description : TODO
 * @Create on : 2019/5/10 16:11
 **/
@ControllerAdvice
public class BaseApi {
    // 日志对象
    protected static final Logger LOGGER = LoggerFactory.getLogger(BaseApi.class);

    public String getTracer() {
        return "authUser";
    }

    @ExceptionHandler
    @ResponseBody
    public Object exception(Exception ex) {
        //记录下日志
        LOGGER.error(ex.getMessage(), ex);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("msg");
        return apiResponse;
    }
}
