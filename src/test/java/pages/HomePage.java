package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='icon-fallback-text site-nav__link site-nav__link--burger js-drawer-open-button-left']")
    public WebElement mainButton;

    @FindBy(partialLinkText = "Ride-ons")
    public WebElement rideOnsButton;

    @FindBy(partialLinkText = "Racer")
    public WebElement racerButton;

    @FindBy(partialLinkText = "Explorer")
    public WebElement explorerButton;

    @FindBy(partialLinkText = "Two Seat")
    public WebElement twoSeatButton;

    @FindBy(partialLinkText = "All Collection")
    public WebElement allCollectionButton;

    @FindBy(xpath = "//span[@class='icon icon-user']")
    public WebElement login;
}
