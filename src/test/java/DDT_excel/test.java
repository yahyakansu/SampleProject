package DDT_excel;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.RegisterPage;
import utilities.Config;
import utilities.Driver;

public class test {
    @Test
    public void deneme() throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        Faker faker = new Faker();

        HomePage homePage = new HomePage();
        AccountPage accountPage = new AccountPage();
        RegisterPage registerPage = new RegisterPage();

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

        Thread.sleep(2000);
        driver.close();

    }
}
