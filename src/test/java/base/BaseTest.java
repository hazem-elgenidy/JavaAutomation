package base;

import homePage.homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    protected WebDriver driver;
    protected homePage homePage;


    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");


    }

}
