package com.helpta.vcsadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * For Test
 *
 * @author : HongKai.wang
 * @date : 2018/4/3
 */
@Controller
@RequestMapping("/test")
public class TestRestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        return "hello there," + name;
    }

    @RequestMapping("/testFreemarker/{name}")
    public String testFreemarker(@PathVariable("name") String name, ModelMap modelMap) {
        modelMap.addAttribute("name", name);
        return "testFreemarker";
    }
}
