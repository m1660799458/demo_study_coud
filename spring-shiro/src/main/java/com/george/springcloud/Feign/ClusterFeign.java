package com.george.springcloud.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年03月01日 下午4:59
 */

@Service
@FeignClient(value = "${service-url}")
public interface ClusterFeign {

    @GetMapping("/test1")
    public String test1();
}
