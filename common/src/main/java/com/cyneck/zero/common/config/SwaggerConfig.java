package com.cyneck.zero.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.config
 * @Description : SwaggerConfig2的配置
 * @Create on : 2019/5/8 15:43
 **/
@Component
@Configuration
public class SwaggerConfig {

    @Value("${swagger.show}")
    private boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        //用来统一一些公用参数，这里设置前端和后台登录的输入参数
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("sessionId")
                .description("登录令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")  //参数类型为header中的参数
                .required(false)
                .build();
        pars.add(tokenPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(pars)
                .enable(swaggerShow)
                .apiInfo(apiInfo())
                .select()
                //选择controller包
                .apis(RequestHandlerSelectors.basePackage("com.cyneck.zero"))//这种方式我们可以通过指定包名的方式，让 Swagger 只去某些包下面扫描
                .paths(PathSelectors.any())//这种方式可以通过筛选 API 的 url 来进行过滤。
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //自定义信息可按需求填写
                .title("Zero项目RESTful APIs")
                .description("测试")
                .termsOfServiceUrl("http://www.cyneck007.com")
                .contact("Eric")
                .version("1.0")
                .build();
    }
}
