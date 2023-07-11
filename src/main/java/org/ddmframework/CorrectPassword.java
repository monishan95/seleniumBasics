package org.ddmframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectPassword  {

            @Test
            @Parameters({"username","password"})
            public void usingcrctpwd(String valueone,String valuetwo) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");

                WebDriver driver = new ChromeDriver(options);
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

                Thread.sleep(1000);

                driver.manage().window().maximize();

                WebElement username = driver.findElement(By.name("username"));
                username.sendKeys(valueone);

                WebElement password = driver.findElement(By.name("password"));
                password.sendKeys(valuetwo);

                WebElement button = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
                button.click();

                driver.quit();
            }
}
