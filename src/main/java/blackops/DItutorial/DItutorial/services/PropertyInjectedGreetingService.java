package blackops.DItutorial.DItutorial.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "HOHOHOHO Property";
    }
}
