package com.cyneck.zero.entry.model;

import com.cyneck.zero.common.model.BaseEntity;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.model
 * @Description : TODO
 * @Create on : 2019/5/9 09:04
 **/
@Data
@Alias("baseUser")
public class User extends BaseEntity {
    private String name;
}
