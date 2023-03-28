package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    public void setUp(){
        controller = new PropertyInjectedController();
        // Property injection - bad, cannot be private
        controller.greetingService = new ConstructorInjectedGreetingService();
    }
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}