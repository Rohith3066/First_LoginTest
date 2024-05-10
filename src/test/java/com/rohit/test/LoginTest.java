package com.rohit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.test.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeClass
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C:\\Users\\HP\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver(cop);
        driver.get("https://practice.automationtesting.in/my-account/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        LoginPage login = new LoginPage(driver);
        login.enterUserName("rohithkumar302001@gmail.com");
        login.enterPassword("rohith#@!123");
        login.clickLogin();
    }
    @Test
    public void verifyLogin(){
        System.out.println("I am page title"+driver.getTitle());
    }
    @AfterClass
    public void closeDriver(){driver.quit();
    }
}
