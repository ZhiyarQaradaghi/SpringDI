package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.FauxDataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    private final FauxDataService fauxDataService;

    public FauxController(@Qualifier("fauxData") FauxDataService fauxDataService) {
        this.fauxDataService = fauxDataService;
    }

    public String generateFaux() {
        return fauxDataService.getEnv() + " Env";
    }

}
