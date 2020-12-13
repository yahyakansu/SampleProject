package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountPage {
    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "CustomerEmail")
    public WebElement email;

    @FindBy(id = "CustomerPassword")
    public WebElement password;

    @FindBy(linkText = "Create Account")
    public WebElement createAccount;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement signIn;
}
