package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // we use the custom bean name to inject
    @Qualifier("propertyGreetingService")
    @Autowired // We want this to be injected -- not recommended - also not required if Injection with Constructor
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
