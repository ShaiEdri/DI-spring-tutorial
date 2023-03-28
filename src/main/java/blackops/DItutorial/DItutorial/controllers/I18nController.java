package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    GreetingService greetingService;
    public I18nController(@Qualifier("i18service") GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayHello();
    }
}
