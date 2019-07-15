package com.chenyu.cloud.cloudapi.service;


import com.chenyu.cloud.cloudapi.entity.SSLInfo;

/**
 * @Author chenyu
 * @Description TODO
 * @Date 2019-07-12 14:46
 */
public interface SSLInfoService {
    SSLInfo findBySSLId(String sslId);
}
