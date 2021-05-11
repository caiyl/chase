package com.league.chase.beanPostProcessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BeanPostProcessorService implements InitializingBean {

    private int age = 1;

    @PostConstruct
    public void init(){
        System.out.println("BeanPostProcessorService----> init");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanPostProcessorService----> afterPropertiesSet");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
