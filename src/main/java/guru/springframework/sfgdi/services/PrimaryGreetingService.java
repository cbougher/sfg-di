package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService, BeanNameAware {
    private String beanName;

    @Override
    public String sayGreeting() {
        return "Hello world - From the Primary Bean";
    }

    public void beforeInit(){
        System.out.println(beanName + " Before Init");
    }

    public void afterInit(){
        System.out.println(beanName + " After Init");
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }
}
