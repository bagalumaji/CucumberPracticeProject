package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(features = {"src/test/resources/features"},
    glue = {"steps","hooks","customparametertype"},
        plugin = {"pretty","summary"},
        snippets = CAMELCASE,
        monochrome = true,
        tags = "@scenario1"
)
public class RunnerTestNGTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void setup(){
        System.out.println("before class");
    }
    @AfterClass
    public void teardown(){
        System.out.println("after class");
    }
}
