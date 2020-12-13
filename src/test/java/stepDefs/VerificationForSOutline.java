package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;
import pages.HomePage;
import utilities.Driver;

public class VerificationForSOutline {
    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();

    @Given("User clicks to the account button")
    public void user_clicks_to_the_account_button() {
        homePage.login.click();
    }

    @Given("User writes own {string} to the email box")
    public void user_writes_own_to_the_email_box(String string) {
        accountPage.email.sendKeys(string);
    }

    @Given("User writes own {string} to the password box")
    public void user_writes_own_to_the_password_box(String string) {
        accountPage.password.sendKeys(string);
    }

    @When("User clicks to the sign in button")
    public void user_clicks_to_the_sign_in_button() {
        accountPage.signIn.click();
    }

    @Then("User should see the own account page")
    public void user_should_see_the_own_account_page() {
        String actualTitle = driver.getTitle();
        String expectedTitle ="Account – Uenjoy";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
