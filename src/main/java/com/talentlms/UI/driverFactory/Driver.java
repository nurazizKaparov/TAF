package com.talentlms.UI.driverFactory;

import com.talentlms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

   public class Driver {

        private Driver() {
            // Singleton pattern
        }

       private static WebDriver driver;

       public static WebDriver getDriver(){
           if (driver == null){
               switch (ConfigReader.getProperty("browser").toLowerCase()) {
                   case "chrome":
                       driver = ChromeWebDriver.loadChromeDriver();
                       break;
                   case "safari":
                       driver = SafariDriver.loadSafariDriver();
                       break;
                   default:
                       driver = SafariDriver.loadSafariDriver();
               }
           }

           return driver;
       }

       public static void closeDriver(){
           try{
               if(driver != null){
                   driver.close();
                   driver.quit();
                   driver= null;
               }
           }
           catch (Exception e){
               e.printStackTrace();
           }
    }}
