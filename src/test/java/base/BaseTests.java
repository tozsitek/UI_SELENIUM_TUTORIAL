package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        goHome();

        homePage = new HomePage(driver);

        /* PLAY AROUND a BIT */
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //mobile size
        //driver.manage().window().setSize(new Dimension(375,667));
        //Find the links on the main page and print the number of them out
        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());
        //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();
        /*
         * On the main page click on "Shifting Content"
         * Then click on the first Example menu element
         */
        /*
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        Thread.sleep(3000);
        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();
        List <WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println(menuItems.size());
        for(WebElement menuItem: menuItems){
            System.out.println(menuItem.getText());
        }
        */
        // CSS locator version
        /*
        driver.findElement(By.cssSelector("a[href='/shifting_content']")).click();
        driver.findElement(By.cssSelector("a[href='/shifting_content/menu']")).click();
        List mItems = driver.findElements(By.tagName("li"));
        System.out.println(mItems.size());
         */
        //System.out.println(driver.getTitle());
        //driver.quit();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    /*
    public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }
    */

}


