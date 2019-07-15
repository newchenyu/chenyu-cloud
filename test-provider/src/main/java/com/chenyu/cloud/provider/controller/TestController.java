package com.chenyu.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenyu
 * @Description just for test
 * @Date 2019-07-15 17:59
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("")
    @ResponseBody
    public String test() {
        return "just for test";
    }
}
