package alertsCH7;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTestsCH7 extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        String expectedAlertMessage = "You successfully clicked an alert";
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), expectedAlertMessage, "Alert message is incorrect.");
    }

    // Testing the JS confirm alert
    @Test
    public void testGetTextFromJsAlert(){
        String expectedText = "I am a JS Confirm";
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerJsConfirmAlert();
        String text = alertsPage.alert_getTextForConfirm();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, expectedText,"Incorrect JS confirm alert message.");
    }

    @Test
    public void testSetPromptInputAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptAlert();
        String text = "Marianna is happy";
        String expectedResult = "You entered: Marianna is happy";
        // Add the tex in the input box
        alertsPage.alert_setInputForPrompt(text);
        //click OK
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), expectedResult,"Incorrect PROMPT alert message.");

    }
}
