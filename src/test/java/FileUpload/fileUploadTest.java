package FileUpload;

import base.BaseTest;
import Pages.fileUploadPage;  // Consider renaming to FileUploadPage (capital F)
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import static org.testng.Assert.assertEquals;

public class fileUploadTest extends BaseTest {

    private fileUploadPage fileUploadPage;
    String fileName;
    String filePath;

    @BeforeMethod
    public void setUpFileUploadPage() {

        homePage.clickFileUpload();
        fileUploadPage = new fileUploadPage(driver);
    }

    @Test
    public void testFileUpload() {
        fileName = "Hello.txt";
        filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaAutomation\\src\\main\\resources\\Hello.txt";

        fileUploadPage.uploadFile(filePath).clickUploadButton();
        assertEquals(fileUploadPage.getUploadedFileName(), fileName, "Uploaded file name does not match the expected name.");
    }
}