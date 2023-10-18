package files;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    private WebDriver driver;

    @Test
    public void testFileUpload(){
        var uploadFilePage  = homePage.clickFileUpload();
        uploadFilePage.uploadFile("/Users/marianna/Documents/TECH/Intellij/testautomation/webdriver_java/resources/chromedriver");
        assertEquals(uploadFilePage.getUploadedFileName(), "chromedriver", "Incorrect name for uploaded file.");
    }

}
