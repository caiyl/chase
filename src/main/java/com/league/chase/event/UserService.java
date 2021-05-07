package com.league.chase.event;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;

    }

    public void register(String userName){
        applicationEventPublisher.publishEvent(new RegisterEvent(this,new User()));
    }

    public void sayHello(){
        System.out.println("userService sayHello");
    };
}
