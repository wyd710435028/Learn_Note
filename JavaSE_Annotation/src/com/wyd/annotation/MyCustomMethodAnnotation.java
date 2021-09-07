package com.wyd.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
@Target(ElementType.METHOD)//定义注解能用的范围
@Retention(RetentionPolicy.RUNTIME)//定义注解的保留策略 RUNTIME策略才能用反射,因为反射只在运行时起作用
public @interface MyCustomMethodAnnotation {
    String title() default "";
     String desc() default "";
}
