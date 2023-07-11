package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class WwSelectablesLao {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new InternetExplorerDriver();

        driver.navigate().to("https://www.leafground.com/list.xhtml");

        driver.manage().window().maximize();

        List<WebElement>  list = driver.findElements(By.xpath("\\*[@role='menu']/li"));
        int count = list.size();
        System.out.println(count);
    }



}
