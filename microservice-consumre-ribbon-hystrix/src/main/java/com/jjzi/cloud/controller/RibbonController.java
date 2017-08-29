package com.jjzi.cloud.controller;

import com.jjzi.common.entity.User;
import com.jjzi.cloud.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonHystrixService ribbonService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id){
        return this.ribbonService.findById(id);
    }
}
