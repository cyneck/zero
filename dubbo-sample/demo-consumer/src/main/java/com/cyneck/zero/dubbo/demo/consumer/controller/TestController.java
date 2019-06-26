package com.cyneck.zero.dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyneck.zero.dubbo.demo.api.RemoteTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.dubbo.demo.consumer.controller
 * @Description : TODO
 * @Create on : 2019/6/25 17:31
 **/
@RestController
public class TestController {

    @Reference
    RemoteTestService remoteTestService;

    @GetMapping("test")
    public String sayHello() {
        return remoteTestService.getTest();
    }
}
