package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    private WebDriver driver;



    //constructor
    public homePage(WebDriver driver)
    {
        this.driver = driver;
        
    }

    //methods
    public void clickFormAuth()
    {
        clickLink("Form Authentication");

    }
    public void clickDropdown()
    {
        clickLink("Dropdown");

    }
    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();

    }
    public void clickHovers()
    {
        clickLink("Hovers");

    }
    public void clickJavaScriptAlerts()
    {
        clickLink("JavaScript Alerts");

    }

}
