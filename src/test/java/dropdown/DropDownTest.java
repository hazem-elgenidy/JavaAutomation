package dropdown;

import base.BaseTest;
import Pages.DropdownPage;
import homePage.homePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {
    private DropdownPage dropdownPage;
    private homePage homePage;
    private String option = "Option 2";

    @Test
    public void TestDropDown()
    {
        homePage = new homePage(driver);
        dropdownPage = new DropdownPage(driver);
        homePage.clickDropdown();
        dropdownPage.selectFromDropDown(option);

        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"the size is incorrect");
        assertTrue(selectedOptions.contains(option),"the option is incorrect");
    }
}
