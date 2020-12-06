package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utilities.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports","json:target/cukesreport.json"},
        features = "src/test/resources/features",
        glue = "stepDefs",
        dryRun = false,
        tags = "@Ride-ons"
)
public class CukesRunner {
    @AfterClass
    public static void tearDown(){
//        ExtentReport.endReport();
        Driver.closeDriver();
    }
}
