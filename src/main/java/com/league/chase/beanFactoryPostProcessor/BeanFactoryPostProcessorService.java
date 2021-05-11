package com.league.chase.beanFactoryPostProcessor;


import org.springframework.stereotype.Service;

/**
 * BeanFactoryPostProcessor实现类
 * @author chase
 */
@Service
public class BeanFactoryPostProcessorService {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanFactoryPostProcessorService{" +
                "name='" + name + '\'' +
                '}';
    }
}
