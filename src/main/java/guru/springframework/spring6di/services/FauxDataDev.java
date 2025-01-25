package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service("fauxData")
public class FauxDataDev implements FauxDataService{
    @Override
    public String getEnv() {
        return "DEV Data";
    }
}
