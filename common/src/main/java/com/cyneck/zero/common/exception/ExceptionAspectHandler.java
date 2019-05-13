package com.cyneck.zero.common.exception;

import com.cyneck.zero.common.model.ApiResponse;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.exception
 * @Description : 使用切面的方式制定异常处理逻辑
 * @Create on : 2019/5/10 18:04
 **/
@Component
@Aspect
public class ExceptionAspectHandler {

    public static final Logger logger = LoggerFactory.getLogger(ExceptionAspectHandler.class);

    @Pointcut("execution(* com.cyneck.zero.*.*(..))")//此处基于自身项目的路径做具体的设置
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        ApiResponse apiResponse = new ApiResponse();
        try {
            logger.info("执行Controller开始: " + pjp.getSignature() + " 参数：" + Lists.newArrayList(pjp.getArgs()).toString());
            apiResponse = (ApiResponse) pjp.proceed(pjp.getArgs());
            logger.info("执行Controller结束: " + pjp.getSignature() + "， 返回值：" + apiResponse.toString());
            logger.info("耗时：" + stopwatch.stop().elapsed(TimeUnit.MILLISECONDS) + "(毫秒).");
        } catch (Throwable throwable) {
            //apiResponse = handlerException(pjp, throwable);
        }

        return apiResponse;
    }

    private ApiResponse<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
        ApiResponse<?> apiResponse = null;
        return apiResponse;
    }

}
