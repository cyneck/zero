package com.cyneck.zero.entry.dao;

import com.cyneck.zero.entry.model.User;
import com.cyneck.zero.entry.model.condition.UserCondition;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.dao
 * @Description : mybatis-spring-boot注解写法
 * @Create on : 2019/5/9 10:53
 **/
public interface UserMapper extends BaseMapper<User> {

    @Select("insert into user (name) values (#{name})")
    int insertUser(User user);

    @Select("SELECT * FROM user")
    @Results({@Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")})
    List<User> getAll();

    @Select("SELECT * FROM user")
    @ResultType(value = User.class)
    List<User> getPageList();

    @Select("SELECT * FROM user order by #{orderField} #{orderDirection}")
    @ResultType(value = User.class)
    List<User> getUserPage(UserCondition condition);

}
