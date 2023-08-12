package com.searchutilities.base;

import com.searchutilities.utils.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    // Declare the driver and property object
    public static WebDriver driver;
    public static Properties prop;

    // CREATING CONSTRUCTOR OF TestBase CLASS
    public TestBase() {
        // TO READ THE config.properties FILE
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir")+"/src/main/java/com/searchutilities/config/config.properties"
            );
            prop.load(ip);
        }   catch(FileNotFoundException e) {
                e.printStackTrace();
        }   catch(IOException e) {
                e.printStackTrace();
        }
    }
    public void startTest() {
        String browserName = prop.getProperty("browser");

        // Initialize the driver
        switch(browserName) {
            case("chrome"):
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir")+"/src/main/java/com/searchutilities/utils/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            case("edge"), ("firefox"):
                break;
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));


//        String directory = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", directory+"/utils/chromedriver.exe");
//        driver = new ChromeDriver(options);
//        driver.get("google.com");
    }

    public void endTest() {
        driver.quit();
    }
}
