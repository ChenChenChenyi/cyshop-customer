package com.cyshop.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2024/5/14 20:52
 * @Created by 陈义
 */
@RestController
public class HelloController {
    /**
    * @Description:
    * @Author: chenyi
    * @Date: 2024/5/14
    */
    @GetMapping("/hello")
    public void sayHello(){
        System.out.println("Hello chenyi and yinxiangzhao!");
    }


    


}
