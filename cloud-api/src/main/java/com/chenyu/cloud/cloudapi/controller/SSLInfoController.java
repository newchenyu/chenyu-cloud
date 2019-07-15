package com.chenyu.cloud.cloudapi.controller;

import com.chenyu.cloud.cloudapi.entity.SSLInfo;
import com.chenyu.cloud.cloudapi.service.SSLInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author chenyu
 * @Description 证书的一些处理
 * @Date 2019-07-12 10:35
 */
@RestController
@RequestMapping("/v5/api/ssl")
public class SSLInfoController {
    @Autowired
    private SSLInfoService sslInfoService;

    @GetMapping("/{sslId}")
    @ResponseBody
    public SSLInfo findBySSLId(@PathVariable("sslId") String sslId) {
        return sslInfoService.findBySSLId(sslId);
    }
}
