package slides;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestHorizontalSlides extends BaseTests {

    @Test
    public void testHorizontalSlide(){
        String value = "4";
        var horizontalSlide = homePage.clickHorizontalSlider();
        horizontalSlide.slideBar(value);
        assertEquals(horizontalSlide.getSliderValue(), value, "Slider value is incorrect.");
    }
}
