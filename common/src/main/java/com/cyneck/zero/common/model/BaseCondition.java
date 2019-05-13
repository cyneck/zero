package com.cyneck.zero.common.model;

import lombok.Data;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.model
 * @Description : TODO
 * @Create on : 2019/5/13 16:16
 **/

@Data
public class BaseCondition {
    private int pageNum;    // 第几页
    private int pageSize;    // 每页记录数
}
