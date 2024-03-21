package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;
import utils.Driver;

import java.time.Duration;

public class ObiletBrowserPage {
    public ObiletBrowserPage(){
        PageFactory.initElements(new AppiumFieldDecorator(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(15)), this);

    }
    @FindBy(xpath = "//button[@data-event-label='Menu Opened']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[@data-event-action='Language Select']")
    public WebElement languageBar;

    @FindBy(xpath = "(//a[@data-event-label='TR-TR'])[1]")
    public WebElement turkishLanguage;

    @FindBy(xpath = "//*[@class='currency-modal-btn-sign sidebar-icon']")
    public WebElement currenyBar;

    @FindBy(xpath = "(//*[@data-code='TRY'])[1]")
    public WebElement turkishLira;
}
