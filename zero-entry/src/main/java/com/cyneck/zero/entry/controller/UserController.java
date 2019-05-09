package com.cyneck.zero.entry.controller;

import com.cyneck.zero.entry.dao.UserDao;
import com.cyneck.zero.entry.dao.UserMapper;
import com.cyneck.zero.entry.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.controller
 * @Description : 用户控制器
 * @Create on : 2019/5/9 08:55
 **/
@Api(description = "Zero 接口文档", tags = "Zero", value = "Zero API")
@RestController
@RequestMapping(value = "/home/*")
public class UserController {

    @Resource
    private UserDao userDao;

    @Resource
    private UserMapper userMapper;

    @ApiOperation(value = "", notes = "异常测试")
    @ApiImplicitParam(name = "test", value = "---", required = false)
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        throw new NullPointerException();
    }

    @Valid
    @ApiOperation(value = "index", notes = "简单SpringMVC请求")
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public List<User> index(HttpServletResponse response,
                            @RequestParam(name = "id", required = false)
                            @NotBlank(message = "id不能为空") String id) {
        List<User> userList = userMapper.getAll();
        return userList;
    }

    @ApiOperation(value = "user", notes = "用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "user/{id}", method = RequestMethod.POST)
    public User getUser(@PathVariable("id") String id,
                        @RequestBody() User user) {
        List<User> userList = userDao.selectUserList();
        return user;
    }
}
