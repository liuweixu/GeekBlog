package com.liublog.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liublog.blog.dto.OperationLogDTO;
import com.liublog.blog.vo.PageResult;
import com.liublog.blog.entity.OperationLog;
import com.liublog.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author liuweixu
 * @date 2023/03/29
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
