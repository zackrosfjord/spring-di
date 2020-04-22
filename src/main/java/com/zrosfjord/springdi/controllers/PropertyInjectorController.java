package com.zrosfjord.springdi.controllers;

import com.zrosfjord.springdi.services.GreetingService;

public class PropertyInjectorController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
