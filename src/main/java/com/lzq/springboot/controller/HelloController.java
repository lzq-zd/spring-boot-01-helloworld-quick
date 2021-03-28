package com.lzq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Author: 中都
 * @Date: 2021/3/28 17:01
 * @Description: TODO
 */
@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick";
    }
}
