package com.jjzi.cloud.client;

import com.jjzi.common.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "microservice-provider",fallback = HystrixClientFallBack.class)
public interface UserFeignHystrixClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);

}
