package DDT_excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;
import utilities.ExcelUtils;

import java.util.List;

public class ListAllCollections {
    WebDriver driver = Driver.getDriver();

    @BeforeTest
    public void setUp(){
        driver.get(Config.getProperties("uenjoyURL"));
        driver.findElement(By.partialLinkText("All Collection")).click();
    }

    @Test
    public void allProductsTest(){
        Assert.assertEquals(driver.getTitle(),"Products – Uenjoy");

        String a=driver.findElement(By.xpath("//div[@class='count']")).getText();
        String[] b=a.split(" ");
        String c=b[0];
        int itemCounts=Integer.parseInt(c);

        List<WebElement> products=driver.findElements(By.xpath("//span[@class='grid-product__title']"));
        List<WebElement> prices=driver.findElements(By.xpath("//span[@class='grid-product__price']"));
    }

    @Test
    public void sds(){
        ExcelUtils.openExcelFile("src/Sample.xlsx","collection");
        ExcelUtils.setCellValue(0,0,"PRODUCTS");
        ExcelUtils.setCellValue(0,1,"PRICES");
    }



    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
