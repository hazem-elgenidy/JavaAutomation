package Keys;
import homePage.homePage;

import base.BaseTest;
import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesPageTest extends BaseTest {

    private KeyPressesPage keyPressesPage;
    String expectedText = "You entered: A";

    @BeforeMethod
    public void setKeyPressesPage() {
        homePage homePage = new homePage(driver);
        homePage.clickKeyPresses();
        keyPressesPage = new KeyPressesPage(driver);
    }

    @Test
    public void testShiftAKey() {
        keyPressesPage.setText(Keys.chord(Keys.SHIFT, "a"));
        assertEquals(keyPressesPage.getResultText(), expectedText, "The entered text is incorrect");
    }
}
