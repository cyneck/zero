package com.cyneck.zero.entry.controller;

import com.cyneck.zero.common.model.PageEntity;
import com.cyneck.zero.entry.dao.UserDao;
import com.cyneck.zero.entry.dao.UserMapper;
import com.cyneck.zero.entry.model.User;
import com.cyneck.zero.entry.model.condition.UserCondition;
import com.cyneck.zero.entry.service.UserService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

    @Resource
    UserService userService;

    @ApiOperation(value = "", notes = "异常测试")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public PageEntity<User> test() {
        throw new NullPointerException();
    }


    @ApiOperation(value = "index", notes = "简单SpringMVC请求")
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public List<User> index(HttpServletResponse response,
                            @RequestParam(name = "id", required = false)
                            @NotBlank(message = "id不能为空") String id) {
        List<User> userList = userMapper.getAll();
        return userList;
    }

    @Valid
    @ApiOperation(value = "user", notes = "用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User")
    })
    @RequestMapping(value = "user/{id}", method = RequestMethod.POST)
    public List<User> getUser(@PathVariable("id") String id,
                              @RequestBody() User user) {
        List<User> userList = userDao.selectUserList();
        return userList;
    }

    @Valid
    @ApiOperation(value = "getUserPage", notes = "分页请求")
    @RequestMapping(value = "getUserPage", method = RequestMethod.GET)
    public PageEntity getUserPage(
            HttpServletRequest request,
            @RequestParam(name = "pageNum", value = "pageNum", required = true) int pageNum,
            @RequestParam(name = "pageSize", value = "pageSize", required = true) int pageSize) {
        PageEntity userPageEntity = userService.getUserListByCondition(pageNum, pageSize);
        return userPageEntity;
    }


    @ApiOperation(value = "getPage", notes = "分页请求")
    @RequestMapping(value = "getPage", method = RequestMethod.GET)
    public PageEntity getPage() {
        UserCondition condition = new UserCondition();
        condition.setPageNum(1);
        condition.setPageSize(4);
        condition.setOrderField("name");
        condition.setOrderDirection("desc");
        PageEntity rst = userService.getPageByCondition(condition);
        return rst;
    }

}
