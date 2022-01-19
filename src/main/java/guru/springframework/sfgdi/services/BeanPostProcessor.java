package guru.springframework.sfgdi.services;

import org.hibernate.service.spi.Configurable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PrimaryGreetingService) {
            ((PrimaryGreetingService) bean).beforeInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof PrimaryGreetingService) {
            ((PrimaryGreetingService) bean).afterInit();
        }
        return bean;
    }
}
