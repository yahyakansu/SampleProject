package DDT_excel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;
import utilities.ExcelUtils;

import java.util.ArrayList;
import java.util.List;

public class ListAllCollections {
    WebDriver driver = Driver.getDriver();

    @BeforeTest
    public void setUp(){
        driver.get(Config.getProperties("uenjoyURL"));
        driver.findElement(By.xpath("//button[@class='icon-fallback-text site-nav__link site-nav__link--burger js-drawer-open-button-left']")).click();
        driver.findElement(By.partialLinkText("All Collection")).click();
    }

    @Test
    public void allProductsTest() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(),"Products – Uenjoy");

        String a=driver.findElement(By.xpath("//div[@class='count']")).getText();
        String[] b=a.split(" ");
        String c=b[0];
        int itemCounts=Integer.parseInt(c);
        int turn=itemCounts/12;

        List<String> products= new ArrayList<>();
        List<String> prices = new ArrayList<>();

        ExcelUtils.openExcelFile("src/Sample.xlsx","Sheet3");
        ExcelUtils.setCellValue(0,0,"PRODUCTS");
        ExcelUtils.setCellValue(0,1,"PRICES");


        int y=0;
        for (int i=0;i<turn;i++){
            for (int j=1;j<=12;j++){
                String product=driver.findElement(By.xpath("(//span[@class='grid-product__title'])["+j+"]")).getText();
                ExcelUtils.setCellValue((j+y),0,product);
                String price=driver.findElement(By.xpath("(//span[@class='grid-product__price'])["+j+"]")).getText();
                ExcelUtils.setCellValue((j+y),1,price);
                products.add(product);
                prices.add(price);
            }
            WebElement rightClick= driver.findElement(By.xpath("//span[@class='icon icon-arrow-right']"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", rightClick);
            y=y+12;
        }
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
