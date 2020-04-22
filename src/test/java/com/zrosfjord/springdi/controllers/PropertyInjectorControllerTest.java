package com.zrosfjord.springdi.controllers;

import com.zrosfjord.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {

    PropertyInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectorController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}