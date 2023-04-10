package org.SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class sample {
    public static void main(String[] args) throws AWTException{
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions obj = new ChromeOptions();
        obj.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(obj);

        driver.navigate().to("https://www.google.com/");

        WebElement acceptobj = driver.findElement(By.xpath("//*[@id=\'L2AGLb\']/div"));
        acceptobj.click();

        driver.navigate().to("https://www.leafground.com/alert.xhtml");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement profile = wait.until (ExpectedConditions.elementToBeClickable(By.id("rfgdrgr")));
        profile.click();



        //DIFF WAYS TO REFRESH
        driver.navigate().refresh(); //1

        driver.get(driver.getCurrentUrl()); //2

        JavascriptExecutor executor = (JavascriptExecutor) driver;//3 (typecasting)
        executor.executeScript("history.go(0)"); //"locator.reload()"

        Robot robot = new Robot(); //4
        robot.keyPress(KeyEvent.VK_F5); // throws AWT Exception
        robot.keyRelease(KeyEvent.VK_F5);


        //USING SENDKEYS F5 - IT DIDNT WORK - SO ROBOT CLASS HAS TO BE USED
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("uk");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.F5);







    }
}
