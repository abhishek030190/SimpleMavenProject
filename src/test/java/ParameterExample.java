import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    @Parameters({"courseName" , "cityName"})
    @Test
    public void VerifyParameterExample(String courseName ,  String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.google.com");
        driver.manage().window().maximize();


        System.out.println("hello............................");
        WebElement textbox=driver.findElement(By.name("q"));
        textbox.sendKeys(courseName    +   cityName);
        textbox.sendKeys(Keys.ENTER);
        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        Thread.sleep(5000);
      //  driver.close();
    }


}
