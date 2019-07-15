package com.chenyu.cloud.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenyu
 * @Description just for test
 * @Date 2019-07-15 18:06
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("")
    @ResponseBody
    public String test() {
        return restTemplate.getForObject("http://test-provider/test", String.class);
    }

    @GetMapping("/{sslId}")
    @ResponseBody
    public String test1(@PathVariable("sslId") String sslId) {
        return restTemplate.getForObject("http://cloud-api/v5/api/ssl/" + sslId, String.class);
    }
}
