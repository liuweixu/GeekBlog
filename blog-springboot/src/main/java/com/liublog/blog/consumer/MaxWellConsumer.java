package com.liublog.blog.consumer;

import com.alibaba.fastjson.JSON;
import com.liublog.blog.constant.MQPrefixConst;
import com.liublog.blog.dao.ElasticsearchDao;
import com.liublog.blog.dto.ArticleSearchDTO;
import com.liublog.blog.dto.MaxwellDataDTO;
import com.liublog.blog.entity.Article;
import com.liublog.blog.util.BeanCopyUtils;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * maxwell监听数据
 *
 * @author liuweixu
 * @date 2023/03/02
 */
@Component
@RabbitListener(queues = MQPrefixConst.MAXWELL_QUEUE)
public class MaxWellConsumer {
    @Autowired
    private ElasticsearchDao elasticsearchDao;

    @RabbitHandler
//    @KafkaListener(topics = MQPrefixConst.MAXWELL_QUEUE)
    public void process(byte[] data) {
        // 获取监听信息
        MaxwellDataDTO maxwellDataDTO = JSON.parseObject(new String(data), MaxwellDataDTO.class);
        // 获取文章数据
        Article article = JSON.parseObject(JSON.toJSONString(maxwellDataDTO.getData()), Article.class);
        // 判断操作类型
        switch (maxwellDataDTO.getType()) {
            case "insert":
            case "update":
                // 更新es文章
                elasticsearchDao.save(BeanCopyUtils.copyObject(article, ArticleSearchDTO.class));
                break;
            case "delete":
                // 删除文章
                elasticsearchDao.deleteById(article.getId());
                break;
            default:
                break;
        }
    }

}