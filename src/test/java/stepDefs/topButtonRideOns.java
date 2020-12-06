package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Config;
import utilities.Driver;

public class topButtonRideOns {
    WebDriver driver;
    Actions actions;

    @Given("User is on the Uenjoy website")
    public void user_is_on_the_uenjoy_website() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        driver.get(Config.getProperties("uenjoyURL"));
    }

    @When("User click to the Ride-ons button")
    public void user_click_to_the_ride_ons_button() {

    }
    @Then("User should see the new page that releated Ride-ons")
    public void user_should_see_the_new_page_that_releated_ride_ons() {

    }

    @When("User move to the Ride-ons button")
    public void user_move_to_the_ride_ons_button() {

    }

    @When("User click to the Racer button")
    public void user_click_to_the_racer_button() {

    }
    @Then("User should see the new page that releated Racer")
    public void user_should_see_the_new_page_that_releated_racer() {

    }

    @When("User click to the Explorer button")
    public void user_click_to_the_explorer_button() {

    }

    @Then("User should see the new page that releated Explorer")
    public void user_should_see_the_new_page_that_releated_explorer() {

    }

    @When("User click to the Two Seat button")
    public void user_click_to_the_two_seat_button() {

    }

    @Then("User should see the new page that releated Two Seat")
    public void user_should_see_the_new_page_that_releated_two_seat() {

    }
}
