package com.jjzi.cloud.service;

import com.jjzi.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id){
        return restTemplate.getForObject("http://microservice-provider/"+id,User.class);
    }
}
