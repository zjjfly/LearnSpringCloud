package com.jjzi.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//自动刷新配置
@Configuration
@EnableScheduling
public class AutoRefresh {
    @Autowired
    private RefreshEndpoint refreshEndpoint;

    @Scheduled(cron = "0 * * * * *")
    public void refresh(){
        refreshEndpoint.refresh();
    }

}
