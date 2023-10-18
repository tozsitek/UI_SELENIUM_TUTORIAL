package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testBackSpace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        String resultText = "You entered: BACK_SPACE";
        //assertEquals(keyPage.getResult(), resultText, "Result text does not display BACK_SPACE");
        assertEquals(keyPage.getResult(), resultText);
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getResult(),"You entered: 4");
    }
}
