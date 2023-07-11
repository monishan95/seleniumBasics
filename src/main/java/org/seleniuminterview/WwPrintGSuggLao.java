package org.seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class WwPrintGSuggLao {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        WebElement reject = driver.findElement(By.xpath("//*[@id=\'W0wltc\']/div"));
        reject.click();

        WebElement searchbar = driver.findElement(By.name("q"));
        searchbar.sendKeys("fifty");
        searchbar.click();
        Thread.sleep(5000);


        List<WebElement> searchsuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));

        //int position = 0;

        for (WebElement element : searchsuggestions) {
            String text = element.getText();
            System.out.println(text);
            Thread.sleep(3000);
            if (text.contains("Darker")){
                element.click();break;
            }

            /*position++;

            if (position == 5) {
                element.click();
                break;*/
           // }

        }
    }
}
