package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports","json:target/cukesreport.json"},
        features = "src/test/resources/features",
        glue = "stepDefs",
        dryRun = true,
        tags = "@Ride-ons"
)
public class CukesRunner {
    @AfterClass
    public static void tearDown(){
//        ExtentReport.endReport();
    }
}
