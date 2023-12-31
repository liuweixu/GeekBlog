package com.liublog.blog.service;

import com.liublog.blog.dto.CommentBackDTO;
import com.liublog.blog.dto.CommentDTO;
import com.liublog.blog.vo.CommentVO;
import com.liublog.blog.vo.ConditionVO;
import com.liublog.blog.vo.PageResult;
import com.liublog.blog.vo.ReviewVO;
import com.liublog.blog.vo.*;
import com.liublog.blog.dto.ReplyDTO;
import com.liublog.blog.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 评论服务
 *
 * @author liuweixu
 * @date 2023/03/29
 */
public interface CommentService extends IService<Comment> {

    /**
     * 查看评论
     *
     * @param commentVO 评论信息
     * @return 评论列表
     */
    PageResult<CommentDTO> listComments(CommentVO commentVO);

    /**
     * 查看评论下的回复
     *
     * @param commentId 评论id
     * @return 回复列表
     */
    List<ReplyDTO> listRepliesByCommentId(Integer commentId);

    /**
     * 添加评论
     *
     * @param commentVO 评论对象
     */
    void saveComment(CommentVO commentVO);

    /**
     * 点赞评论
     *
     * @param commentId 评论id
     * @param request 请求头信息
     */
    void saveCommentLike(Integer commentId, HttpServletRequest request);

    /**
     * 审核评论
     *
     * @param reviewVO 审核信息
     */
    void updateCommentsReview(ReviewVO reviewVO);

    /**
     * 查询后台评论
     *
     * @param condition 条件
     * @return 评论列表
     */
    PageResult<CommentBackDTO> listCommentBackDTO(ConditionVO condition);

}
