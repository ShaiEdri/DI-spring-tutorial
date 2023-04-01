package blackops.DItutorial.DItutorial.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class i18nEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello EN";
    }
}
