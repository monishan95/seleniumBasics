package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WwIFramesLao {

    public static <WebElements> void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.leafground.com/frame.xhtml");

        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
        button1.click();

        String textappeared = driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
        System.out.println("The text is  "+ textappeared);

        String  theattribute = driver.findElement(By.xpath("//*[@id=\'Click\']")).getAttribute("style");
        System.out.println(theattribute);

        driver.switchTo().defaultContent();
        //driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");

        WebElement button2 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
        button2.click();

        String text2 = driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
        System.out.println("Second text is  "+ text2);
        driver.switchTo().defaultContent();

        List<WebElement> totalframes = driver.findElements(By.tagName("iframe")); //***FINDELEMENTS
        int  count = totalframes.size();
        System.out.println( "number of frames are  " + count);

    }
}
