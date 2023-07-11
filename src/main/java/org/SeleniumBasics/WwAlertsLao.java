package org.SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WwAlertsLao {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");

        //SIMPLE ALERT
         WebElement simpal = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
         simpal.click();
                Thread.sleep(5000);
        Alert ctrl = driver.switchTo().alert();
        ctrl.accept();

        //CONFIRM ALERT

        WebElement confal = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
        confal.click();
                Thread.sleep(5000);
        Alert ctrll = driver.switchTo().alert();   //****IMPORTANT
        ctrll.dismiss();

        //PROMPT ALERT

        WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
        promptbox.click();
                Thread.sleep(5000);
        Alert promal = driver.switchTo().alert();
        promal.sendKeys("okay");
        promal.accept();
    }
}
