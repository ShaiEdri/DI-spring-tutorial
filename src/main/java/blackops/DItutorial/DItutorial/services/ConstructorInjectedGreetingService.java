package blackops.DItutorial.DItutorial.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "HOHOHOHO Constructor";
    }
}
