package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPageCH7 {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By alertMessage = By.id("result");
    private By triggerJsConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJsPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");


    public AlertsPageCH7(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerJsConfirmAlert(){
        driver.findElement(triggerJsConfirmButton).click();
    }

    public void triggerPromptAlert(){
        driver.findElement(triggerJsPromptButton).click();
    }

    //click OK
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    //click cancel
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }


    public String getResults(){
        return driver.findElement(alertMessage).getText();
    }

    public String alert_getTextForConfirm(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInputForPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }


}
