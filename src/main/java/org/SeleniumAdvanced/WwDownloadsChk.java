package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class WwDownloadsChk {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");

        ChromeOptions mxobject = new ChromeOptions();
        mxobject.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(mxobject);
        driver.get("https://www.leafground.com/file.xhtml");

        WebElement downloadbutton = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
        downloadbutton.click();

        Thread.sleep(3000);

        File filelocation = new File("C:\\Users\\Sathiskumar\\Downloads");
        File[] Totalfiles = filelocation.listFiles();//***IMPORTANT
        for (File file:Totalfiles ) {
            if (file.getName().equalsIgnoreCase("testleaf logo.png")){
                System.out.println("DOWNLOADED");break;
            }
        }
    }

}
