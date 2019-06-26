package com.cyneck.zero.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cyneck.zero.dubbo.demo.api.RemoteTestService;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.dubbo.demo.provider.service
 * @Description : TODO
 * @Create on : 2019/6/25 17:48
 **/
@Component
@Service//暴露服务
public class RemoteServiceImpl implements RemoteTestService {

    @Override
    public String getTest() {
        return "provider time:" + new Date().toString();
    }
}
