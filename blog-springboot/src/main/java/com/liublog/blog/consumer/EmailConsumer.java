package com.liublog.blog.consumer;

import com.alibaba.fastjson.JSON;
import com.liublog.blog.constant.MQPrefixConst;
import com.liublog.blog.dto.EmailDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 通知邮箱
 *
 * @author liuweixu
 * @date 2023/04/13
 * @since 1.0.0
 **/
@Component
@Slf4j
@RabbitListener(queues = MQPrefixConst.EMAIL_QUEUE)
public class EmailConsumer {

    /**
     * 邮箱号
     */
    @Value("${spring.mail.username}")
    private String email;

    @Autowired
    private JavaMailSender javaMailSender;

    @RabbitHandler
    public void process(byte[] data) {
        EmailDTO emailDTO = JSON.parseObject(new String(data), EmailDTO.class);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email);
        message.setTo(emailDTO.getEmail());
        message.setSubject(emailDTO.getSubject());
        message.setText(emailDTO.getContent());
        javaMailSender.send(message);
    }

//    @KafkaListener(topics = MQPrefixConst.EMAIL_KAFKA_TOPIC)
//    public void onMessage(String string){
//        if(StringUtils.isNotBlank(string)){
//            Map map = JSON.parseObject(string, Map.class);
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom(email);
//            message.setTo((String) map.get("email"));
//            message.setSubject((String) map.get("subject"));
//            message.setText((String) map.get("content"));
//            javaMailSender.send(message);
//        }
//    }

}
