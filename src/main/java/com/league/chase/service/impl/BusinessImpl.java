package com.league.chase.service.impl;

import com.league.chase.service.BusinessService;
import com.league.chase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class BusinessImpl implements BusinessService {

//    @Autowired
    private UserService userService;

    @Override
    public String getUserName(Long userId) {
        return userService.queryUserName(userId)+"hello";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
