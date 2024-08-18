import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public  void VerifyLoginUser() {
        SoftAssert softassert=new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement forgottenPassword= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        softassert.assertFalse(forgottenPassword.isDisplayed(),"this element should be display");

        WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
        softassert.assertEquals(user.getText(),"This is the user textbox");
         softassert.assertAll();
        driver.close();
    }
}
