package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
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

        Thread.sleep(1000);
//        driver.close();
        Driver.closeDriver();
    }
}
