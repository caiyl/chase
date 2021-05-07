package com.league.chase.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class RegisterEventListener implements ApplicationListener<RegisterEvent> {

    @Override
    public void onApplicationEvent(RegisterEvent applicationEvent) {
        System.out.println("事件---"+applicationEvent.getSource().getClass().getName());
        UserService service = (UserService) applicationEvent.getSource();
        service.sayHello();

    }

}
