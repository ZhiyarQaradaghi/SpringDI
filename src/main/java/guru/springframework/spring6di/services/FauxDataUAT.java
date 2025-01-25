package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("fauxData")
public class FauxDataUAT implements FauxDataService{
    @Override
    public String getEnv() {
        return "UAT Data";
    }
}

