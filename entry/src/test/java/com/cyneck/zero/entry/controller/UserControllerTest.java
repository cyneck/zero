package com.cyneck.zero.entry.controller;

import com.alibaba.fastjson.JSONObject;
import com.cyneck.zero.entry.ApplicationEntry;
import com.cyneck.zero.entry.model.vo.TenantVo;
import com.cyneck.zero.entry.service.UserService;
import com.mchange.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(ApplicationEntry.class)
public class UserControllerTest {

    //单元测试，租户有关测试数据的资源文件父级路径
    private final String baseParh = "data/";

    @Resource
    UserService userService;

    @Test
    public void getUserPage() throws IOException {
        String fielPath = getClass().getClassLoader().getResource(baseParh + "test.json").getPath();
        File file = new File(fielPath);
        if (file.exists()) {
            String json = FileUtils.getContentsAsString(file);
            TenantVo tenantVo = JSONObject.parseObject(json, TenantVo.class);
            System.out.println("success");

//            UserCondition condition = new UserCondition();
//            condition.setPageNum(1);
//            condition.setPageSize(4);
//            condition.setOrderField("name");
//            condition.setOrderDirection("desc");
//            PageEntity page = userService.getPageByCondition(condition);
//            userService.getPageByCondition(condition);
        }

    }
}
