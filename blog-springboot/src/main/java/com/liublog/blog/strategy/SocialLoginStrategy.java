package com.liublog.blog.strategy;

import com.liublog.blog.dto.UserInfoDTO;

/**
 * 第三方登录策略
 *
 * @author liuweixu
 * @date 2023/03/28
 */
public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);

}
