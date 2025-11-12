package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getSelectedOption(){
        return findDropdownElement().getAllSelectedOptions()
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }
}
