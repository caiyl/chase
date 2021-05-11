package com.league.chase.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("beanPostProcessorService")){
            System.out.println("postProcessBeforeInitialization beanName---->"+beanName);
            BeanPostProcessorService newBean = (BeanPostProcessorService) bean;
            ((BeanPostProcessorService) bean).setAge(2);

        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("beanPostProcessorService")){
            System.out.println("postProcessAfterInitialization beanName---->"+beanName);
            System.out.println("postProcessAfterInitialization beanName---->"+((BeanPostProcessorService)bean).getAge());
            BeanPostProcessorService newBean  = new BeanPostProcessorService();
            newBean = new BeanPostProcessorService();
            newBean.setAge(3);
            return newBean;
        }

        return bean;
    }
}
