package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;


@Service("propertyGreetingService") // custom bean name
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection";
    }
}
