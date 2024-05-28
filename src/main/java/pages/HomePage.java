package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPageCH5 clickHovers() {
        clickLink("Hovers");
        return new HoversPageCH5(driver);
    }

    public KeyPressesPageCH6 clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPageCH6(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPageCH7 clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPageCH7(driver);
    }

    // CH 7.2 File uploads
    public FileUploadPageCH7 clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPageCH7(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
       clickLink("Dynamic Loading");
       return new DynamicLoadingPage(driver);
    }

    public ContextMenuPageCH7Modals clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPageCH7Modals(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
