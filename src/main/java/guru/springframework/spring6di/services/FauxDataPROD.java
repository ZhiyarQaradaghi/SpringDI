package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("fauxData")
public class FauxDataPROD implements FauxDataService{
    @Override
    public String getEnv() {
        return "PROD Data";
    }
}
