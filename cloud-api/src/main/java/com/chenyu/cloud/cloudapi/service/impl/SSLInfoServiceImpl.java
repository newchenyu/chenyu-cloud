package com.chenyu.cloud.cloudapi.service.impl;

import com.chenyu.cloud.cloudapi.dao.SSLInfoMapper;
import com.chenyu.cloud.cloudapi.entity.SSLInfo;
import com.chenyu.cloud.cloudapi.service.SSLInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author chenyu
 * @Description TODO
 * @Date 2019-07-12 14:46
 */
@Service("sslInfoService")
public class SSLInfoServiceImpl implements SSLInfoService {
    @Autowired
    private SSLInfoMapper sslInfoMapper;
    @Override
    public SSLInfo findBySSLId(String sslId) {
        return sslInfoMapper.findBySSLId(sslId);
    }
}
