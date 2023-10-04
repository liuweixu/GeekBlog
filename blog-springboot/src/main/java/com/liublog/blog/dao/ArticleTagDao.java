package com.liublog.blog.dao;

import com.liublog.blog.entity.ArticleTag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 文章标签
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Repository
public interface ArticleTagDao extends BaseMapper<ArticleTag> {

    void saveArticleTags(@Param("articleId") Integer articleId, @Param("tags") List<Integer> tags);

}
