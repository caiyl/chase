package com.league.chase.configuration;

import com.league.chase.service.SayHelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @version 0.1.0
 * @author chase
 * @since 0.1.0
 * @create 2020/12/14下午4:35
 **/
@Configuration
public class DefConfiguration {

    @Bean
    public SayHelloService getSayHelloService(){
        return new SayHelloService();
    }
}
