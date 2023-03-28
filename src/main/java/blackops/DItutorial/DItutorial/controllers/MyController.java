package blackops.DItutorial.DItutorial.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        return "Hi";
    }
}
