package com.cyneck.zero.entry.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FeignConfiguration {

    /**
     * 使用feign默认契约，而不是spring mvc的默认契约
     * 注意：生效的类上的写法发生契约变换。在调用feign时，configuration值中，需要增加自定义配置类
     *
     * @return
     */
    /*@Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }*/
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}