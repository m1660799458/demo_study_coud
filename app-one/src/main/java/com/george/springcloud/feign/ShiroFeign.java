package com.george.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * todo
 *
 * @author xingqiyi
 * @date 2021年03月01日 下午3:08
 */
@Component
@FeignClient(value = "${service-url}")
public interface ShiroFeign {
    /**
     * test
     *
     * @return
     */
//    @GetMapping(value = "/test")
//    public String test();
}

