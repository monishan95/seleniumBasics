package org.seleniuminterview;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WwEnterLao {

    static WebElement q;

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement reject = driver.findElement(By.xpath("//*[@id=\'W0wltc\']/div"));
        reject.click();
        Thread.sleep(3000);

    //DIFF WAYS TO FIND ACTIVE ELEMENT

        driver.switchTo().activeElement().sendKeys("rasagulla \n"); //METHOD - 1

        PageFactory.initElements(driver,WwEnterLao.class); //METHOD - 2
            q.sendKeys("Rasagulla" + Keys.ENTER);


// GIVE INPUT WITHOUT SENDKEYS
        driver.switchTo().activeElement();  // METHOD - 1
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);

        JavascriptExecutor executor = (JavascriptExecutor) driver;  Thread.sleep(2000);//METHOD - 2
        executor.executeScript("document.getElementsByName('q')[0].value='bun parota'","");
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);


        WebElement searchbar = driver.findElement(By.name("q")); Thread.sleep(2000);//METHOD - 3
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].value='christian grey'",searchbar);  //***IMPORTANT
        Thread.sleep(2000);
        searchbar.submit();
    }

}
