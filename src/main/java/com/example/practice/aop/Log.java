package com.example.practice.aop;

import java.lang.annotation.*;

/**
 * @author: Song Yimin
 * @description:
 * @date: 2020/4/15
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented //作用域javadoc
@Inherited //可继承，声明子类可以继承此注解，如果一个类A使用此注解，则类A的子类也继承此注解
public @interface Log {

    String title() default "";

    String operType() default "";
    /**
     * 是否保存请求的参数
     */
    boolean isSaveRequestData() default true;
}
