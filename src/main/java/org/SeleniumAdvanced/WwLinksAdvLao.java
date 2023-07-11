package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WwLinksAdvLao {
    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.leafground.com/link.xhtml");

        WebElement destination = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a"));
        String dest = destination.getAttribute("href");
        System.out.println("It takes to  "+ dest);



    }
}
