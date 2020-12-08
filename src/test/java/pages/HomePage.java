package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Ride-ons")
    public WebElement rideOnsButton;

    @FindBy(partialLinkText = "Racer")
    public WebElement racerButton;

    @FindBy(partialLinkText = "Explorer")
    public WebElement explorerButton;

    @FindBy(partialLinkText = "Two Seat")
    public WebElement twoSeatButton;
}
