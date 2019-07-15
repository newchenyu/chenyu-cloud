package com.chenyu.cloud.cloudapi.dao;

import com.chenyu.cloud.cloudapi.entity.SSLInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("sslInfoMapper")
public interface SSLInfoMapper {
    SSLInfo findBySSLId(@Param("sslId") String sslId);
}
