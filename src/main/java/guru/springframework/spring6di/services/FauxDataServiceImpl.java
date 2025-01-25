package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("general")
@Service("fauxData")
public class FauxDataServiceImpl implements FauxDataService {
    @Override
    public String getEnv() {
        return "A string of datasource";
    }
}
