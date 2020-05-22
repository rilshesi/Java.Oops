package tutorial.fullCodes.excellDriven.example3.seleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    private static String iePath = "\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\example3\\seleniumCode\\IEDriverServer1.exe";
    private static String firefoxPath ="\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\example3\\seleniumCode\\geckodriver.exe";
    private static String path = "\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\example3\\seleniumCode\\material.properties";
    private static   WebDriver driver;
    private String browserName;
    private static String url;



    public static WebDriver initialDriver(String browserName) throws IOException {

        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        cap.setCapability("requireWindowFocus", true);
        cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        InternetExplorerOptions i = new InternetExplorerOptions();
        i.merge(cap);

        Properties base = new Properties();
        FileInputStream f = new FileInputStream(System.getProperty("user.dir")+path);
        base.load(f);

// 4. getting data material.properties
        //browserName = base.getProperty("browser");
        url = base.getProperty("url");


//5. browser options
        if(browserName.contains("chrome")) {

            String chromePath = "\\src\\main\\java\\tutorial\\fullCodes\\excellDriven\\example3\\seleniumCode\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ chromePath);
            // Adding options to chrome browser from DesiredCapabilities cap
            ChromeOptions chro = new ChromeOptions();
            driver = new ChromeDriver(chro);
            if(browserName.contains("chromeheadless"))     // headless means running in the background
            {
                chro.addArguments("headless");
            }

        }


        else if(browserName.contains("firefox")) {

            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+firefoxPath);
            driver = new FirefoxDriver();

        }


        else if (browserName.equals("ie"))
        {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+iePath);
            driver = new InternetExplorerDriver(i);

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        return driver;


    }


}
