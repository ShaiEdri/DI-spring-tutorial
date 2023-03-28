package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayHello();
    }
}
