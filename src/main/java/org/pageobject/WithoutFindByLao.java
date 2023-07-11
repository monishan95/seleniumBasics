package org.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//BIGGEST DRAWBACK IS - UNABLE TO USE WHEN NO ID , USERNAME IS PROVIDED
public class WithoutFindByLao {

        public static WebElement username;
        public static WebElement password;
    @Test
    public void getLoggedin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

        PageFactory.initElements(driver, WithoutFindByLao.class);

        username.sendKeys("Admin");
        password.sendKeys("admin123");

    }
}
