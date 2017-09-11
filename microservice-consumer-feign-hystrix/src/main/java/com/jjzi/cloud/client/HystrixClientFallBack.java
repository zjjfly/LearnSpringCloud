package com.jjzi.cloud.client;

import com.jjzi.common.entity.User;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
class HystrixClientFallBack implements UserFeignHystrixClient{
    @Override
    public User findByIdFeign(@NonNull Long id) {
        log.info("异常发生，进入fallback方法，接收的参数：id={}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default name");
        user.setAge(0);
        return user;
    }
}
