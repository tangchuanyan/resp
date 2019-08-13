package com.hangyan.controller;

import com.hangyan.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 唐川雁[tangchuanyan]
 * @date 2019年08月08日 - PM 05:11:04
 * @history 2019年08月08日 - PM 05:11:04  create.
 */

/* spring boot和Redis整合使用 */
@RestController
public class redisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private RedisService service;


    @RequestMapping("/redis/setAndGet")   //请求例子http://localhost:8080//redis/setAndGet?name=111&value=888
    @ResponseBody
    public String setAndGetValue(String name,String value){
        redisTemplate.opsForValue().set(name,value);
        return (String) redisTemplate.opsForValue().get(name);
    }

    @RequestMapping("/redis/setAndGet2")
    @ResponseBody
    public String setAndGetValue2(String name,String value){
       service.set(name,value);
       return service.get(name).toString(); //toString()方法返回这个对象的字符串

    }

    /*spring boot与mybatis整合使用*/

}
