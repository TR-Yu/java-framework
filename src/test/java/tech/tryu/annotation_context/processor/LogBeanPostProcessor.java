package tech.tryu.annotation_context.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author tryu
 * 打印日志的后置处理器
 */
@Component
public class LogBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before: LogBeanPostProcessor postProcessBeforeInitialization: " + beanName + " " + bean.getClass().getSimpleName());
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After: LogBeanPostProcessor postProcessAfterInitialization: " + beanName + " " + bean.getClass().getSimpleName());
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
