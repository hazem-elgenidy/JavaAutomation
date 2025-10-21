package base;

import homePage.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    String username = ("tomsmith");
    String Password  = ("SuperSecretPassword");


    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username)
                 .enterPassword(Password)
                 .clickLogin();
    }
}
