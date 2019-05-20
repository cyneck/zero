package com.cyneck.zero.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.config
 * @Description : 跨域配置
 * @Create on : 2019/5/17 14:16
 **/
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("http://192.168.1.97")
//                .allowedMethods("GET", "POST")
                .allowCredentials(false).maxAge(3600);
    }
}
