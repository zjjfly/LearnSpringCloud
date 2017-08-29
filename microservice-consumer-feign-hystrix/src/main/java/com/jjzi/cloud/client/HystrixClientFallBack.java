package com.jjzi.cloud.client;

import com.jjzi.common.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class HystrixClientFallBack implements UserFeignHystrixClient{
    private static final Logger logger= LoggerFactory.getLogger(HystrixClientFallBack.class);
    @Override
    public User findByIdFeign(Long id) {
        logger.info("异常发生，进入fallback方法，接收的参数：id={}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return user;
    }
}
