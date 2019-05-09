package com.cyneck.zero.entry.dao;

import com.cyneck.zero.entry.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.dao
 * @Description : TODO
 * @Create on : 2019/5/9 09:01
 **/

public interface UserDao {
    int insert(@Param("user") User user);

    List<User> selectUserList();
}

