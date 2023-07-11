package org.seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WwScrollingLao {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");

        ChromeOptions maximize = new ChromeOptions();
        maximize.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(maximize);
        driver.get("https://www.google.com/");

        WebElement reject = driver.findElement(By.xpath("//*[@id=\'W0wltc\']/div"));
        reject.click();
        Thread.sleep(3000);
        driver.switchTo().activeElement().sendKeys("briyani \n");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scroll(0,700)","");
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,-300)","");
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,0)","");
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,document.body.scrollHeight)","");

        WebElement element = driver.findElement(By.linkText("Samosa"));

        executor.executeScript("arguments[0].scrollIntoView(true);",element);


        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);

    }
}
