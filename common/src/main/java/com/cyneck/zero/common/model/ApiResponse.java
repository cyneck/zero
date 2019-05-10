package com.cyneck.zero.common.model;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.model
 * @Description : TODO @类注释说明写在此处@
 * @Create on : 2019/5/8 15:37
 **/
public class ApiResponse {
    private String code;
    private String message;
    private String state;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
