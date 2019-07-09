package com.cyneck.zero.common.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.filter
 * @Description : 过滤器扩展重写,实现jwt权限过滤器
 * @Create on : 2019/5/13 09:38
 **/
public class JwtFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        //todo:通常用于过滤http业务无关的过滤
        System.out.println("JwtFilter操作！");
        //通行则调用
        chain.doFilter(request, response);
    }

}