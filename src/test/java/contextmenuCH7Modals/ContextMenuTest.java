package contextmenuCH7Modals;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    @Test
    public void testRightClick(){
        var menuPage = homePage.clickContextMenu();
        menuPage.rightClickInBox();
        String message = menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }

}
