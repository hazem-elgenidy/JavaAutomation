package JsDialogues;

import base.BaseTest;
import homePage.homePage;
import homePage.JavascriptAlertPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JsDialoguesTest extends BaseTest {

    private homePage homePage;
    private JavascriptAlertPage javascriptAlertPage;

    @BeforeMethod
    public void pageSetUp() {
        homePage = new homePage(driver);
        javascriptAlertPage = new JavascriptAlertPage(driver);
        homePage.clickJavaScriptAlerts();
    }

    @Test
    public void testAlerts() {
        javascriptAlertPage.triggerAlert();
        javascriptAlertPage.alertClicktoAccept();

        String resultText = "You successfully clicked an alert";
        assertEquals(javascriptAlertPage.getResultText(), resultText, "The alert result text is incorrect");
    }

    @Test
    public void testConfirm() {
        javascriptAlertPage.triggerConfirm();

        String expectedAlertText = "I am a JS Confirm";
        assertEquals(javascriptAlertPage.alertGetText(), expectedAlertText, "Alert text is incorrect");

        javascriptAlertPage.alertClicktoCancel();
        assertEquals(javascriptAlertPage.getResultText(), "You clicked: Cancel", "The confirm result text is incorrect");
    }

    @Test
    public void testPrompt() {
        String text = "Route";
        String expectedPromptText = "I am a JS prompt";

        javascriptAlertPage.triggerPrompt();
        assertEquals(javascriptAlertPage.alertGetText(), expectedPromptText, "Prompt text is incorrect");

        javascriptAlertPage.alertSetText(text);
        javascriptAlertPage.alertClicktoAccept();

        assertTrue(javascriptAlertPage.getResultText().contains(text), "Prompt result does not contain entered text");
    }
}
