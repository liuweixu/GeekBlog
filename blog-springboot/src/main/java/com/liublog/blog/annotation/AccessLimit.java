package com.liublog.blog.annotation;

import java.lang.annotation.*;

/**
 * @author liuweixu
 * @date 2023/03/23 11:16
 * @description redis接口限流
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AccessLimit {

    /**
     * 单位时间（秒）
     *
     * @return int
     */
    int seconds();

    /**
     * 单位时间最大请求次数
     *
     * @return int
     */
    int maxCount();
}
