package org.test.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String LOGIN = "login";
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterUserName(String username){
        driver.findElement(By.id(USERNAME)).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(By.id(PASSWORD)).sendKeys(password);
    }

    public void clickLogin( ){
        driver.findElement(By.name(LOGIN)).click();
    }
}
