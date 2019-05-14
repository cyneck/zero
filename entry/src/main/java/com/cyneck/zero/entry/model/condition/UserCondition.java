package com.cyneck.zero.entry.model.condition;

import com.cyneck.zero.common.model.BaseCondition;
import lombok.Data;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.model.condition
 * @Description : 用户类型的查询条件
 * @Create on : 2019/5/13 14:39
 **/
@Data
public class UserCondition extends BaseCondition {
    private String name;
}
