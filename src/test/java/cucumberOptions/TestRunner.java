package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = {"stepsDefinition"}, tags = "@SeleniumTest2", //tags = "@SomeTest and @SmokeTest"
//        monochrome=true,
        plugin = {"pretty", "json:target/cucumber.json", "junit:target/cukes.xml"}) //tags = "@SomeTest and @SmokeTest"

public class TestRunner
{
}

