package org.seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WwGoogleUrlsLao {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions maximize = new ChromeOptions();
        maximize.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(maximize);
        driver.get("https://www.google.com/");

        WebElement reject = driver.findElement(By.xpath("//*[@id=\'W0wltc\']/div"));
        reject.click();

        WebElement searchbar = driver.findElement(By.name("q"));
        searchbar.sendKeys("Dosa \n");

       /* List<WebElement> totallists = driver.findElements(By.xpath("//a")); // VERY IMP***TO GET ALL LINKS TEXT PRINTED

        for (WebElement list : totallists) {
            System.out.println(list.getText()); // WILL GIVE ALL LINKS AS TEXT
            System.out.println(list.getAttribute("href"));
        }*/ //WILL GIVE ALL LINKS URL
        Thread.sleep(3000);

        List<WebElement> greenURLslist = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
        for (WebElement greenURL : greenURLslist) {
            System.out.println(greenURL.getText());
        }

    }
}


