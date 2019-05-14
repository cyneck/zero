package com.cyneck.zero.common.aop.page.annotation;

import java.lang.annotation.*;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.common.aop.page.annotation
 * @Description : 分页声明
 * @Create on : 2019/5/13 15:08
 **/
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PageAnnotation {
    Class clazz();//类型
}
