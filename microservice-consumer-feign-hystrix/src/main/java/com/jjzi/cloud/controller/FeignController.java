package com.jjzi.cloud.controller;

import com.jjzi.cloud.client.UserFeignHystrixClient;
import com.jjzi.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private UserFeignHystrixClient feignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        return feignClient.findByIdFeign(id);
    }

}
