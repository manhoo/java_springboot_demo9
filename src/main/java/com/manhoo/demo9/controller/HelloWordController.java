package com.manhoo.demo9.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWordController {
    Logger logger = LoggerFactory.getLogger(HelloWordController.class);
    @RequestMapping("/hello")
    public String index(@RequestParam(value = "name") String name) {
        return String.format("我是周末，hello;this is good, me is %s", name);
    }

    @RequestMapping(path = "/Hello/manhoo")
    public String manhoo() {

        logger.info("我是日志， 你看到我了吗？");
        return "不支持中文吗？";

    }
}