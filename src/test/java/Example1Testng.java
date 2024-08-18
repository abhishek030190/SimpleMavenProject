import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1Testng {

    public static WebDriver driver;

    @BeforeMethod
    public void TestMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void TestForAmazon() throws InterruptedException {
       driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void TestForFlipkart() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void AfterMethod(){
       driver.close();
    }
}
