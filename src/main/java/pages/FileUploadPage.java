package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By fileUploaded = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides the path of the file to the form then clicks upload button
     * @param : absolutePathOfFile
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(chooseFile).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFileName(){
        return driver.findElement(fileUploaded).getText();
    }

}
