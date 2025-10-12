package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDay2 {
    private static WebDriver driver;
    private static final By input = By.linkText("inputs");
    private static final By inputUpdate = By.xpath("//a[contains(text(),'Inputs')]");

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(350, 400));
        driver.getTitle();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement titleText = driver.findElement(By.className("heading"));
        System.out.println(titleText.getText());

        WebElement  inputLocatorLink = driver.findElement(input);

        //locate element
        driver.findElement(By.tagName("h1"));
        WebElement inputLocator = driver.findElement(input);
        inputLocator.click();


       List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + links.size());



        driver.close();
        driver.quit();


    }

    public static WebElement getInput(int i) {
        return driver.findElement(By.xpath("//ul/li[" + i + "]/a"));

    }
}