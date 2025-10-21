package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    private WebDriver driver;

    //locators
    @FindBy(linkText = "Form Authentication")
    private WebElement FormAuth;


    //constructor
    public homePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //methods
    public void clickFormAuth()
    {
        FormAuth.click();

    }
}
