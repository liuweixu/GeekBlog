package com.liublog.blog.dao;

import com.liublog.blog.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * 用户信息
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Repository
public interface UserInfoDao extends BaseMapper<UserInfo> {

}
