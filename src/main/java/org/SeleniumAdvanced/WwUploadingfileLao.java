package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WwUploadingfileLao {

    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions maximize = new ChromeOptions();
        maximize.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(maximize);
        driver.navigate().to("https://www.leafground.com/file.xhtml");

        WebElement uploadbutton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']"));
        uploadbutton.click();

        String file = "C:\\Users\\Sathiskumar\\Downloads\\TestLeaf Logo.png";

        StringSelection pastecontent = new StringSelection(file);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pastecontent,null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

}
