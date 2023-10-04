package com.liublog.blog.service;

import com.liublog.blog.entity.FriendLink;
import com.liublog.blog.dto.FriendLinkBackDTO;
import com.liublog.blog.dto.FriendLinkDTO;
import com.liublog.blog.vo.ConditionVO;
import com.liublog.blog.vo.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liublog.blog.vo.FriendLinkVO;

import java.util.List;

/**
 * 友链服务
 *
 * @author liuweixu
 * @date 2023/03/29
 */
public interface FriendLinkService extends IService<FriendLink> {

    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);

}
