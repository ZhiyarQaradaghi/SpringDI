package guru.springframework.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("fauxData")
public class FauxDataQA implements FauxDataService{
    @Override
    public String getEnv() {
        return "QA Data";
    }
}
