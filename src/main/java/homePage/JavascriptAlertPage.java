package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertPage {
    private WebDriver driver;

    private By alertTriggerButton = By.xpath("//button[contains(.,'Alert')]");
    private By confirmTriggerButton = By.xpath("//button[contains(.,'Confirm')]");
    private By promptTriggerButton = By.xpath("//button[contains(.,'Prompt')]");
    private By resultText = By.id("result");

    public JavascriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(alertTriggerButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(confirmTriggerButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(promptTriggerButton).click();
    }

    public void alertClicktoAccept() {
        driver.switchTo().alert().accept();
    }

    public void alertClicktoCancel() {
        driver.switchTo().alert().dismiss();
    }

    public String alertGetText() {
        return driver.switchTo().alert().getText();
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }

    public void alertSetText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}
