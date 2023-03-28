package blackops.DItutorial.DItutorial.controllers;

import blackops.DItutorial.DItutorial.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    public void setUp(){
        controller = new PropertyInjectedController();
        // Property injection - bad, cannot be private
        controller.greetingService = new GreetingServiceImpl();
    }
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}