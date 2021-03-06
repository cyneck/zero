package com.cyneck.zero.entry.service.impl;

import com.cyneck.zero.common.aop.page.annotation.PageAnnotation;
import com.cyneck.zero.common.model.PageEntity;
import com.cyneck.zero.entry.dao.UserMapper;
import com.cyneck.zero.entry.model.User;
import com.cyneck.zero.entry.model.condition.UserCondition;
import com.cyneck.zero.entry.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.service.impl
 * @Description : TODO
 * @Create on : 2019/5/13 14:14
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public PageEntity getUserListByCondition(int pageNum, int pageSize) {
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.getPageList();
        return new PageEntity<User>(userList);
    }

    @Override
    @PageAnnotation(clazz = User.class)
    public PageEntity<User> getPageByCondition(UserCondition condition) {
        // 用注解的方式实现了下面一行该代码
        // Page page = PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        List list = userMapper.getUserPage(condition);
        return new PageEntity<User>(list);
    }

}
