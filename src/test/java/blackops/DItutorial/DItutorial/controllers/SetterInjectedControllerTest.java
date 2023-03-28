package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @BeforeEach
    public void setUp(){
        // Setter injection - better but not clean
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    void sayHello() {
        controller.sayHello();
    }
}