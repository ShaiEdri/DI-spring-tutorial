package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    public void setUp(){
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
        // Constructor injection - cleanest and preferred way
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}