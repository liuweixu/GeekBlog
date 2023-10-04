package com.liublog.blog.annotation;

import java.lang.annotation.*;

/**
 * 操作日志注解
 *
 * @author liuweixu
 * @date 2023/03/28
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {

    /**
     * @return 操作类型
     */
    String optType() default "";

}
