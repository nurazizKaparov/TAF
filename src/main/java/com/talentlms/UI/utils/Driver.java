package com.talentlms.UI.utils;

import com.talentlms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Driver {

    private Driver(){
        // Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                default:driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }

    public static void closeDriver(){
        try {
            if (driver != null){
                driver.close();  //закрывает
                driver.quit();   //выходит
                driver = null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
