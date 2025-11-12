package Frames;

import Pages.FramePage;
import Pages.NestedFramesPage;
import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    private FramePage framePage;
    private NestedFramesPage nestedFramesPage;

    @BeforeMethod
    public void setUpFramesTest()
    {
        nestedFramesPage = new NestedFramesPage(driver);
        framePage = new FramePage(driver);

    }
    @Test
    public void testFrames()
    {
        homePage.clickFrames();
        framePage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","Left frame text mismatch");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","Bottom frame text mismatch");

    }
}
