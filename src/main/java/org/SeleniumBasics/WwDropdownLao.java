package org.SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WwDropdownLao {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");

    //SELECT BY FUNCTION (3) - SELECT BY INDEX,VALUE,VISIBLE TEXT

        WebElement ddobject = driver.findElement(By.className("ui-selectonemenu"));
        Select theobject = new Select(ddobject);
        //theobject.selectByIndex(2);
        //theobject.selectByVisibleText("Cypress");
        //theobject.selectByValue("");

    //FIND NUMBER OF OPTIONS IN DD - ****IMPORTANT****
        List<WebElement> noofoptions = theobject.getOptions();
        int count = noofoptions.size();
        System.out.println("the number of options are  "+ count);


    //SELECT AN OPTION IN DD USING TEXT
        ddobject.sendKeys("Puppeteer");


    /*//MULTISELECT

            WebElement multiselect = driver.findElement(By.id("j_idt87:country_input")); //DOUBT
            multiselect.click();
            Select formultisel = new Select(multiselect);
            formultisel.selectByVisibleText("Jmeter");
            formultisel.selectByIndex(3);
            formultisel.selectByVisibleText("Selenium");
        }*/
        //input_userName.sendkeys("suryap");


    }
}
