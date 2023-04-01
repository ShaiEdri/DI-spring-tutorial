package i18n;

import blackops.DItutorial.DItutorial.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18service")
public class i18nSpanishService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hola ES";
    }
}
