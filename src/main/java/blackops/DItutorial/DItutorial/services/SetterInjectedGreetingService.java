package blackops.DItutorial.DItutorial.services;

import org.springframework.stereotype.Service;

public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "HOHOHOHO Setter";
    }
}
