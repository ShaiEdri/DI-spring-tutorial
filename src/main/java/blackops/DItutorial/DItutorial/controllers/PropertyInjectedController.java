package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayHello();
    }
}
