package hovers;

import base.BaseTest;
import Pages.HoversPage;
import homePage.homePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTest extends BaseTest {
    private homePage homePage;
    private HoversPage hoversPage;

    @Test
    public void testHovers()
    {
        homePage = new homePage(driver);
        hoversPage = new HoversPage(driver);
        homePage.clickHovers();

        var figureCaption = hoversPage.hoverOverFigure(2);
        assertTrue(figureCaption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(figureCaption.getName(), "name: user2","Name is incorrect");
        assertEquals(figureCaption.getLinkText(), "View profile");
       assertTrue(figureCaption.getLink().endsWith("/users/2"),"Link is incorrect");

    }
}
