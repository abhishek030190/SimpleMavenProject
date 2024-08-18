import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataProviderWithExcel {
    @DataProvider(name = "test-data")
    public Object[][] dataFunctionScript() throws IOException {

        Object[][] arrObj = getExcelData("D:\\Testdata.xlsx", "Sheet1");
        return arrObj;
    }

    public String[][] getExcelData(String filepath, String sheetName) throws IOException {

        FileInputStream fileinputstream = new FileInputStream(filepath);
        XSSFWorkbook wb = new XSSFWorkbook(fileinputstream);
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();
        Cell cell;

        String[][] data = new String[noOfRows - 1][noOfColumn];
        for (int i = 1; i <= noOfRows - 1; i++) {
            for (int j = 0; j < noOfColumn; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                System.out.println(data[i - 1][j] = cell.getStringCellValue());

            }

        }
        return data;

    }
    @Test(dataProvider = "test-data")
    public void VerifyDataProviderExample (String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.google.com");
        driver.manage().window().maximize();


        System.out.println("hello............................");
        WebElement textbox = driver.findElement(By.name("q"));
        textbox.sendKeys(courseName + cityName);
        textbox.sendKeys(Keys.ENTER);
        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        Thread.sleep(5000);
        //  driver.close();
    }
}