package com.cyneck.zero.entry.api;

import com.cyneck.zero.entry.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "users", url = "/test", configuration = FeignConfiguration.class)
public interface UserApi {

    @GetMapping(value = "/index")
    String testRouting(String parameter);

}
