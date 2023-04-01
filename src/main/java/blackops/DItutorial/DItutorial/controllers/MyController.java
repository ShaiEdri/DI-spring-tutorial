package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    GreetingService greetingService;
    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayHello();
    }
}
