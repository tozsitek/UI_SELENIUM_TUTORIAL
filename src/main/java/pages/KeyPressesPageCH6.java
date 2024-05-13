package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPageCH6 {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPageCH6(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    //enter multiple keys: ALT+p for PI
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }


    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
