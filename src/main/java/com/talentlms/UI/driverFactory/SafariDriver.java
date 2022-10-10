package com.talentlms.UI.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SafariDriver {

    public static WebDriver loadSafariDriver(){

        WebDriverManager.safaridriver().setup();
        WebDriver driver =new org.openqa.selenium.safari.SafariDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
