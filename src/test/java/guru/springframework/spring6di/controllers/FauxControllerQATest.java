package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
public class FauxControllerQATest {

    @Autowired
    FauxController fauxControllerQA;

    @Test
    void generateFaux() {
        System.out.println(fauxControllerQA.generateFaux());
    }
}
