package com.liublog.blog.service.impl;

import com.liublog.blog.entity.ArticleTag;
import com.liublog.blog.dao.ArticleTagDao;
import com.liublog.blog.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章标签服务
 *
 * @author liuweixu
 * @date 2023/03/10
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {

}
