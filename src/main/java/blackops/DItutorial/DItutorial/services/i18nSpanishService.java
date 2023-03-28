package blackops.DItutorial.DItutorial.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18service")
public class i18nSpanishService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hola ES";
    }
}
