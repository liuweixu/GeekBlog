package com.liublog.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liublog.blog.entity.ChatRecord;
import org.springframework.stereotype.Repository;

/**
 * 聊天记录
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
