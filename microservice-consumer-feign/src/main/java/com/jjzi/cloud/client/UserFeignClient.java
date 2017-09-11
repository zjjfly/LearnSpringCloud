package com.jjzi.cloud.client;

import com.jjzi.common.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("microservice-provider")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@PathVariable("id") Long id);
}
