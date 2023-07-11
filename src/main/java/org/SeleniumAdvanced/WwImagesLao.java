package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WwImagesLao {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/makaroni4/pen/WLzgpN");

        driver.manage().window().maximize();

        WebElement brokenbutton = driver.findElement(By.xpath("/html/body/img"));
        {
            if (brokenbutton.getAttribute("naturalWidth").equals("0")) {
                System.out.println("BROKEN IMAGE");
            } else {
                System.out.println("NOT BROKEN");
            }
        }

    }
}
