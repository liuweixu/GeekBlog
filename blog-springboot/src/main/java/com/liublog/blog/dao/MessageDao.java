package com.liublog.blog.dao;

import com.liublog.blog.entity.Message;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * 留言
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Repository
public interface MessageDao extends BaseMapper<Message> {

}
