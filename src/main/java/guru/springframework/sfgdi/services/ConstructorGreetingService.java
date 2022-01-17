package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class ConstructorGreetingService implements GreetingService, InitializingBean, DisposableBean {
    @Override
    public String sayGreeting() {
        return "Hello world - Controller";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean");
    }

    @PostConstruct
    public void constructed(){
        System.out.println("Bean condtructed");
    }

    @PreDestroy
    public void aboutToDestroy(){
        System.out.println("About to destroy");
    }
}
