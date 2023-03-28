package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @BeforeEach
    public void setUp(){
        // Setter injection - better but not clean
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }
    @Test
    void sayHello() {
        controller.sayHello();
    }
}