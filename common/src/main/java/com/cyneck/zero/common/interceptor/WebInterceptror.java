package com.cyneck.zero.common.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.interceptor
 * @Description : 拦截器，面向切面编程,基于JAVA的反射机制，多个Interceptor的实现，按声明顺序执行
 * @Create on : 2019/5/13 13:36
 **/
public class WebInterceptror implements HandlerInterceptor {


    /**
     * 在请求达到 Controller执行之前，返回 boolean 值，true 表示继续执行，false 为停止执行并返回
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器处理前");
        return true;
    }


    /**
     * 在请求达到 Controller执行之后, 可以在返回之前对返回的结果进行修改
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("处理之后");
    }

    /**
     * 在请求完全结束后调用，可以用来统计请求耗时等等
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("请求完成后");
    }
}
