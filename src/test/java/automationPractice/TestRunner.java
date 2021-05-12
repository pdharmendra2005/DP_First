package automationPractice;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/features/" ,
     //   glue = {"AuthenticationPageSteps", "HomePageSteps", "MyAccountPageSteps"},
        //  tags = "@smoke1  @smoke2",
         // tags = "@smoke1",
        plugin = "html:target/cucumber-reports"
                )
public class TestRunner {
}
