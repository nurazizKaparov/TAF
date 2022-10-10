package СтарыеПроекты.UI;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;
import java.time.Duration;

public class SeleniumDemo {
    String name1 = "Nuraziz";
    String email1 = "kaparov.nuraziz@gmail.com";
    String addres1 = "Elebaeva 70";
    String perm = "Pobeda 103";

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  // заходит и делает полный экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // устанавливает время после захода

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(name1);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys(email1);

        WebElement addres = driver.findElement(By.id("currentAddress"));
        addres.sendKeys(addres1);

        WebElement permanent = driver.findElement(By.id("permanentAddress"));
        permanent.sendKeys(perm);


        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        WebElement name2 = driver.findElement(By.id("name"));
        Assertions.assertEquals(name1,name2.getText().substring(5));
        WebElement email2 = driver.findElement(By.id("email"));
        Assertions.assertEquals(email1,email2.getText().substring(6));
        WebElement addres2 = driver.findElement(By.id("currentAddress"));
        Assertions.assertFalse(addres2.getText().contains(addres1));
        WebElement perm2 = driver.findElement(By.cssSelector("#permanentAddress"));
        Assertions.assertTrue(perm2.getText().contains(perm));


    }

    @Test
    public void xpathTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        driver.manage().window().maximize();  // заходит и делает полный экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // устанавливает время после захода

        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("John");

        WebElement email = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
        email.sendKeys("nur@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddress.sendKeys("Elebaeva 70");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Fuchik123");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submitButton.sendKeys();


    }

    @Test
    public void newTets(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  // заходит и делает полный экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // устанавливает время после захода

        driver.get("https://demoqa.com/automation-practice-form");


        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Nuraziz");
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Kaparov");
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("kaparov.nuraziz@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        WebElement gender = driver.findElement(By.xpath("//label[@class='custom-control-label']"));
        gender.click();
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
        mobileNumber.sendKeys("777999888555");
        WebElement subjects = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjects.sendKeys("His");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        WebElement hobbies = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
        hobbies.click();
        WebElement hobbies1 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
        hobbies1.click();
        WebElement hobbies2 = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
        hobbies2.click();
        WebElement img = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        img.sendKeys("C:\\Users\\Compkg_nout\\OneDrive\\Pictures\\vladstudio_googlelibrary_1920x1200.jpg");
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAddress.sendKeys("Elebaeva 70");
        WebElement state = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        state.sendKeys("NCR");
        actions.sendKeys(Keys.ENTER).build().perform();
        WebElement city = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        city.sendKeys("Noida");
        actions.sendKeys(Keys.ENTER).build().perform();
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();



    }
}
