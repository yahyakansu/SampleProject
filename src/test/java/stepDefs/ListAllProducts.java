package stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.Driver;

public class ListAllProducts {
    WebDriver driver=Driver.getDriver();

    @When("User click to the All Collections button")
    public void user_click_to_the_All_Collections_button() {
        HomePage homePage = new HomePage();
        homePage.mainButton.click();
        homePage.allCollectionButton.click();
    }

    @Then("User should see the new page that related to All Collection")
    public void user_should_see_the_new_page_that_related_to_All_Collection() {
        String expectedTitle="Products – Uenjoy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Title is NOT equal with expected title",expectedTitle,actualTitle);
    }
}
