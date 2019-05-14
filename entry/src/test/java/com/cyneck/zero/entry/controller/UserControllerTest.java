package com.cyneck.zero.entry.controller;

import com.cyneck.zero.common.model.PageEntity;
import com.cyneck.zero.entry.ApplicationEntry;
import com.cyneck.zero.entry.model.condition.UserCondition;
import com.cyneck.zero.entry.service.UserService;
import com.github.pagehelper.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(ApplicationEntry.class)
public class UserControllerTest {

    @Resource
    UserService userService;

    @Test
    public void getUserPage() {
        UserCondition condition = new UserCondition();
        condition.setPageNum(1);
        condition.setPageSize(4);
        condition.setOrderField("name");
        condition.setOrderDirection("desc");
        PageEntity page = userService.getPageByCondition(condition);
        userService.getPageByCondition(condition);
    }
}
