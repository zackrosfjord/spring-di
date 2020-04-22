package com.zrosfjord.springdi.controllers;

import com.zrosfjord.springdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
