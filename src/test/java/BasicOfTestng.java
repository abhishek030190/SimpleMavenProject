import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicOfTestng {
public static WebDriver driver;
    @BeforeMethod
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        driver = new ChromeDriver();
    }
        @Test
        public void TestExample2() {
            driver.get("https://jqueryui.com/datepicker/");
            driver.manage().window().maximize();
system.out.println("hello world");
        }
         @Test
        public void Example2(){
            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
       system.out.println("hello world");
        }
        @Test
public void Example3(){
system.out.println("this is the example 3")}
      
    }

