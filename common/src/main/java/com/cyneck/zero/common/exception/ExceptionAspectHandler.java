package com.cyneck.zero.common.exception;

import com.cyneck.zero.common.model.ApiResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

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


    @Pointcut("execution(* com.cyneck.zero..*(..))")//此处基于自身项目的路径做具体的设置
    public void ExceptionPointcut() {
/*        第一种：表示在UserMangeImpl类下的所有方法，这种方式在之前的案例使用的。
        @Pointcut("execution(* com.spring.two.UserMangeImpl.*(..))")

        第二种：表示任意公共的方法，其他修饰符也同样的道理。
        @Pointcut("execution(public * *(..))")

        第三种：任何一个以set开始的方法，不仅仅是set，save、update也都行。
        @Pointcut("execution(* set*(..))")

        第四种：在指定包下的所有方法
        @Pointcut("execution(* com.spring.*.*(..))")
*/
    }


    /**
     * 后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
     */
    @After("ExceptionPointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("方法最后执行.....");
    }


    /**
     * 后置异常通知
     */
    @AfterThrowing(value = "ExceptionPointcut()", throwing = "error")
    public ApiResponse throwsExcpetion(JoinPoint joinPoint, Throwable error) {
        System.out.println("异常时执行.....");
        ApiResponse apiResponse = new ApiResponse("400", "400", "error");

        /*获得 request */
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return apiResponse;
    }

}
