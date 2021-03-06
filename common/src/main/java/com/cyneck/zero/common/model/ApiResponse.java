package com.cyneck.zero.common.model;

import lombok.Data;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.model
 * @Description : TODO @类注释说明写在此处@
 * @Create on : 2019/5/8 15:37
 **/
@Data()
public class ApiResponse<T> {
    private String code;
    private String message;
    private String state;
    private T data;

    public ApiResponse() {
    }

    public ApiResponse(String state, String code, String msg) {
        this.state = state;
        this.code = code;
        this.message = msg;
    }
}
