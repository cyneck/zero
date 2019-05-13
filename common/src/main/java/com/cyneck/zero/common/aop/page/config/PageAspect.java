package com.cyneck.zero.common.aop.page.config;

import com.cyneck.zero.common.model.BaseCondition;
import com.github.pagehelper.PageHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.aop.page.config
 * @Description : TODO
 * @Create on : 2019/5/13 15:12
 **/
@Aspect
@Component
public class PageAspect {

    /**
     * 切点是注解的方式,切点签名，表示声明了@OperationLogDetail的注解的方法，将aop生效
     * 相应的，还有@Point("execution(<匹配制定的包下的类/>)")
     */
    @Pointcut("@annotation(com.cyneck.zero.common.aop.page.annotation.PageAnnotation)")
    public void PageAnnotation() {
    }

    /**
     * 相当于直接使用上面的方法
     *
     * @param joinPoint
     */
    @Before("PageAnnotation()")
    public void doBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("进入方法前执行.....");
        Object[] arguments = joinPoint.getArgs();   //获得参数列表
        BaseCondition condition = new BaseCondition();
        for (Object object : arguments) {
            if (object instanceof BaseCondition) {
                condition = (BaseCondition) object;
            }
        }
        PageHelper.startPage(condition);
        /*获得 request */
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 环绕增强，相当于MethodInterceptor
     */
    @Around("PageAnnotation()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object res = joinPoint.proceed();
        System.out.println("环绕增强");
        return res;
    }

    /**
     * 处理完请求，返回内容
     *
     * @param ret
     */
    @AfterReturning(returning = "ret", pointcut = "PageAnnotation()")
    public void doAfterReturning(Object ret) {
        System.out.println("方法的返回值 : " + ret);
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing("PageAnnotation()")
    public void throwsExcpetion(JoinPoint jp) {
        System.out.println("方法异常时执行.....");
    }


    /**
     * 后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
     */
    @After("PageAnnotation()")
    public void after(JoinPoint jp) {
        System.out.println("方法最后执行.....");
    }

}
