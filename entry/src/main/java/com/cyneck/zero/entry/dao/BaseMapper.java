package com.cyneck.zero.entry.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.dao
 * @Description : TODO
 * @Create on : 2019/5/13 10:52
 **/
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
