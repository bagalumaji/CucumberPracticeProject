package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }
}
