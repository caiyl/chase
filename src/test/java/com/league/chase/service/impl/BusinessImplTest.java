package com.league.chase.service.impl;

import com.league.chase.service.UserService;
import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class BusinessImplTest {

    @InjectMocks
    private BusinessImpl businessmock;

    @Mock
    private UserService userServiceMock;



    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    public void tearDown() {
        Mockito.reset(userServiceMock);
    }

    @Test
    public void getUserName() {
        BusinessImpl mock = Mockito.mock(BusinessImpl.class);

//        UserService mock1 = Mockito.mock(UserService.class);
        when(userServiceMock.queryUserName(10L)).thenReturn("aaa");
        when(userServiceMock.queryUserName(1L)).thenReturn("wang");


        System.out.println(businessmock.getUserName(10L));

        ;

    }
}