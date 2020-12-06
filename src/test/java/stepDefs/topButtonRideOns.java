package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Config;
import utilities.Driver;

public class topButtonRideOns {
    WebDriver driver;
    WebElement element;
    Actions actions;
    HomePage homePage;

    @Given("User is on the Uenjoy website")
    public void user_is_on_the_uenjoy_website() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        homePage = new HomePage();
        driver.get(Config.getProperties("uenjoyURL"));
    }

    @When("User click to the Ride-ons button")
    public void user_click_to_the_ride_ons_button() {
        homePage.rideOnsButton.click();
    }
    @Then("User should see the new page that releated Ride-ons")
    public void user_should_see_the_new_page_that_releated_ride_ons() {
        String expectedTitle="Ride On Cars – Uenjoy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("User move to the Ride-ons button")
    public void user_move_to_the_ride_ons_button() {
        actions.moveToElement(homePage.rideOnsButton).perform();
    }

    @When("User click to the Racer button")
    public void user_click_to_the_racer_button() {
        homePage.racerButton.click();
    }

    @Then("User should see the new page that releated Racer")
    public void user_should_see_the_new_page_that_releated_racer() {
        String expectedTitle="Racer – Uenjoy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("User click to the Explorer button")
    public void user_click_to_the_explorer_button() {
        homePage.explorerButton.click();
    }

    @Then("User should see the new page that releated Explorer")
    public void user_should_see_the_new_page_that_releated_explorer() {
        String expectedTitle="Explorer – Uenjoy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("User click to the Two Seat button")
    public void user_click_to_the_two_seat_button() {
        homePage.twoSeatButton.click();
    }

    @Then("User should see the new page that releated Two Seat")
    public void user_should_see_the_new_page_that_releated_two_seat() {
        String expectedTitle="Two Seat – Uenjoy";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
