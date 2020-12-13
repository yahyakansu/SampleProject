package DDT_ScenarioOutline;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.RegisterPage;
import utilities.Config;
import utilities.Driver;

public class Register {
    WebDriver driver;
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();

    @BeforeTest
    public void setUp(){
        driver= Driver.getDriver();
    }

    @Test
    public void createAccount(){
        driver.get(Config.getProperties("uenjoyURL"));
        homePage.login.click();
        accountPage.createAccount.click();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.bothify("?????##@gmail.com");
        String password = faker.bothify("??#??####");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(password);

        registerPage.firstName.sendKeys(firstName);
        registerPage.lastName.sendKeys(lastName);
        registerPage.email.sendKeys(email);
        registerPage.password.sendKeys(password);
        registerPage.submitButton.click();

//        Shane
//        Mann
//        isdfw01@gmail.com
//        wp4kt6301
    }

    @AfterTest
    public void tearDown(){
//        driver.close();
    }
}
