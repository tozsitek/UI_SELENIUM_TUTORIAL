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
        uploadFilePage.uploadFile("C:\\Users\\marianna.fields\\repos\\sandbox\\UI_SELENIUM_TUTORIAL\\resources\\chromedriver.exe");
        assertEquals(uploadFilePage.getUploadedFileName(), "chromedriver.exe", "Incorrect name for uploaded file.");
    }

}
