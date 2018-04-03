package com.helpta.vcsadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * For Test
 *
 * @author : HongKai.wang
 * @date : 2018/4/3
 */
@RestController
@RequestMapping("/test")
public class TestRestController {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello there," + name;
    }
}
