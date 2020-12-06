package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class try1 {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions opt = new ChromeOptions();
//        opt.addArguments("--disable-notifications");
//        WebDriver driver = new ChromeDriver(opt);

//        WebDriverManager.firefoxdriver().setup();
//        FirefoxOptions opt = new FirefoxOptions();
//        opt.addPreference("dom.webnotifications.enabled",false);
//        WebDriver driver = new FirefoxDriver(opt);

        WebDriver driver = Driver.getDriver();
        driver.get("https://uenjoy.com/");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.partialLinkText("Uenjoy Ride-ons"))).perform();

        driver.findElement(By.partialLinkText("Racer")).click();

        Thread.sleep(2000);

        Driver.closeDriver();
    }
}
