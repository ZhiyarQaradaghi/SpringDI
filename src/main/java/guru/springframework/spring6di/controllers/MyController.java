package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I am in the controller");
        return greetingService.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("Before init method -- Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("After init method -- Called by Bean Post Processor");
    }
}
