package com.jjzi.cloud.service;

import com.jjzi.common.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class RibbonHystrixService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(@NonNull Long id) {
        return restTemplate.getForObject("http://microservice-provider/" + id, User.class);
    }

    public User fallback(@NonNull Long id) {
        log.info("异常发生，进入fallback方法，接收的参数：id={}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return user;
    }

}
