package com.league.chase.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Service;

/**
 * @author chase
 */
@Service
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        //configurableListableBeanFactory可以修改bean的定义，注册新的bean等。
        BeanDefinition service = configurableListableBeanFactory.getBeanDefinition("beanFactoryPostProcessorService");

        //模拟 PropertySourcesPlaceholderConfigurer向 bean的属性设置值。
        MutablePropertyValues pvs = new MutablePropertyValues();
        pvs.addPropertyValue(new PropertyValue("name","zhangsan"));
        ((ScannedGenericBeanDefinition) service).setPropertyValues(pvs);

        System.out.println("MyBeanFactoryPostProcessor postProcessBeanFactory():"+service.getBeanClassName());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
