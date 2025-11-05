package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public DropdownPage selectFromDropDown (String option)
    {
        findDropdownElement().selectByVisibleText(option);
        return this;
    }
    public List<String> getSelectedOptions()
    {
        List<WebElement> optionElements = findDropdownElement().getAllSelectedOptions();
        List<String> optionText = new ArrayList<>();
        for (WebElement Element : optionElements) {
            optionText.add(Element.getText());

    }
        return optionText;
    }
    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }
}
