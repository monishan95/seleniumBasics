package org.pageobject;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WwithFindbyPageFactory {

    @Test
    public   void loginandUpdate() {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver, FindbyObjects.class);

        FindbyObjects.email.sendKeys("user@phptravels.com");
        FindbyObjects.password.sendKeys("demouser");
        FindbyObjects.submit.click();
        FindbyObjects.profile.click();
        FindbyObjects.State.sendKeys("Texas");
        FindbyObjects.city.sendKeys("Houston");
    }
}

