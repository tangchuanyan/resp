package com.hangyan.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author 唐川雁[tangchuanyan]
 * @date 2019年08月08日 - PM 04:35:33
 * @history 2019年08月08日 - PM 04:35:33  create.
 */
@Configuration //用于定义配置类，可替换xml文件
public class RedisConfig {
    @Bean  //把redisTemplate注入到spring容器交由spring容器进行管理
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,String> redisTemplate=new RedisTemplate<String, String>();
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;


    }
}
