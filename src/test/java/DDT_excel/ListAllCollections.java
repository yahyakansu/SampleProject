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
        driver.findElement(By.partialLinkText("All Collection")).click();
    }

    @Test
    public void allProductsTest() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(),"Products – Uenjoy");

        String a=driver.findElement(By.xpath("//div[@class='count']")).getText();
        String[] b=a.split(" ");
        String c=b[0];
        int itemCounts=Integer.parseInt(c);
        int turn=itemCounts/12-1;

        List<String> products= new ArrayList<>();
        List<String> prices = new ArrayList<>();

        for (int i=0;i<turn;i++){
            for (int j=1;j<=12;j++){
                String product=driver.findElement(By.xpath("(//span[@class='grid-product__title'])["+j+"]")).getText();
                String price=driver.findElement(By.xpath("(//span[@class='grid-product__price'])["+j+"]")).getText();
                products.add(product);
                prices.add(price);
            }
            WebElement rightClick= driver.findElement(By.xpath("//span[@class='icon icon-arrow-right']"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click()", rightClick);
            System.out.println(i);
        }

        for (String e:prices) {
            System.out.println(e);
        }
        for (String e:products){
            System.out.println(e);
        }

    }
    public static Boolean isVisibleInViewport(WebElement element) {
        WebDriver driver = ((RemoteWebElement)element).getWrappedDriver();

        return (Boolean)((JavascriptExecutor)driver).executeScript(
                "var elem = arguments[0], " +
                        "box = elem.getBoundingClientRect()," +
                        "cx = box.left + box.width / 2, " +
                        "cy = box.top + box.height / 2, " +
                        "e = document.elementFromPoint(cx, cy); " +
                        "for (; e; e = e.parentElement) { " +
                        "if (e === elem) return true;}return false;", element);
    }

    @Test
    public void sds(){
        ExcelUtils.openExcelFile("src/Sample.xlsx","Sheet3");

        ExcelUtils.setCellValue(0,0,"PRODUCTS");
        ExcelUtils.setCellValue(0,1,"PRICES");

    }


    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
