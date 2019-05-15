package com.cyneck.zero.entry.dao;

import com.cyneck.zero.entry.model.User;
import com.cyneck.zero.entry.model.condition.UserCondition;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.dao
 * @Description : TODO
 * @Create on : 2019/5/9 09:01
 **/

@Mapper
public interface UserDao {

    int addUser(@Param("user") User user);

    List<User> selectUserList();

}

