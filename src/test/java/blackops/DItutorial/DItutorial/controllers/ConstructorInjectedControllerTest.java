package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    public void setUp(){
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
        // Constructor injection - cleanest and preferred way
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}