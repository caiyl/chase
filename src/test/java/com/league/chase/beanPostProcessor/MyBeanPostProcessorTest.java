package com.league.chase.beanPostProcessor;

import com.league.chase.event.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBeanPostProcessorTest {
    @Autowired
    private BeanPostProcessorService service;

    @Test
    public void serviceTest(){
        System.out.println("MyBeanPostProcessorTest---->"+service.getAge());
    }
}