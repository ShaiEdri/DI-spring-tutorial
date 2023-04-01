package blackops.DItutorial.DItutorial.services;

import org.springframework.stereotype.Service;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "HOHOHOHO Property";
    }
}
