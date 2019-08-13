package com.hangyan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 唐川雁[tangchuanyan]
 * @date 2019年08月08日 - PM 04:12:49
 * @history 2019年08月08日 - PM 04:12:49  create.
 */
@RestController //@Controller和@ResponseBody的结合
public class Study_redis {
    @RequestMapping("/hello")   //网址请求格式：localhost:8090/hello（默认端口为8080）
    @ResponseBody  //没有也可以请求成功
    public String aa(){

        return "hello";
    }

}
