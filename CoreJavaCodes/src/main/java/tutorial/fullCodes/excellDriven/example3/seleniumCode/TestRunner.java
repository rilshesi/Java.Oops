package tutorial.fullCodes.excellDriven.example3.seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tutorial.fullCodes.excellDriven.example3.Constant;
import tutorial.fullCodes.excellDriven.example3.ExcelData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestRunner {

    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {

        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
        ExcelData.setExcelFile(Constant.Path_TestData,"Sheet1");

        //Opening browser
        BaseClass.initialDriver("firefox");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //SignIn to Web

        System.out.println("Login Successfully, now it is the time to Log Off buddy.");



        driver.quit();

        //This is to send the PASS value to the Excel sheet in the result column.

        ExcelData.setCellData("Pass", 1, 3);

    }
}
