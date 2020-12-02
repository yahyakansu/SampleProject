package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class try1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://uenjoy.com/");
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.linkText("Uenjoy Ride-ons")));
//        actions.moveToElement(driver.findElement(By.partialLinkText("Racer"))).click();
        Thread.sleep(1000);
//        driver.close();
    }
}
