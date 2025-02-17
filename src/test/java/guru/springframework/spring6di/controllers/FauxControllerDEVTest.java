package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
public class FauxControllerDEVTest {

    @Autowired
    FauxController fauxControllerDEV;

    @Test
    void generateFaux() {
        System.out.println(fauxControllerDEV.generateFaux());
    }
}
