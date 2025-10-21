package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(css = "#login > Button")
    private WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    //methods
    public LoginPage enterUsername(String name){
        username.sendKeys(name);
        return this;
    }
    public LoginPage enterPassword(String Password){
        password.sendKeys(Password);
        return this;
    }
    public LoginPage clickLogin(){
        loginButton.click();
        return this;
    }
}
