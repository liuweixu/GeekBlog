package com.liublog.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liublog.blog.entity.OperationLog;
import org.springframework.stereotype.Repository;


/**
 * 操作日志
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {
}
