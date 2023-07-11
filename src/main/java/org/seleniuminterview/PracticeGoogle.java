package org.seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class PracticeGoogle {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        ChromeOptions maximize = new ChromeOptions();
        maximize.addArguments("--start-maximized");


        WebDriver driver = new ChromeDriver(maximize);
        driver.get("https://www.google.com/");

        WebElement reject = driver.findElement(By.xpath("//*[@id=\'W0wltc\']/div"));
        reject.click();

        WebElement searchbar = driver.findElement(By.name("q"));
        searchbar.sendKeys("anaconda");
        searchbar.click();

        Thread.sleep(2000);

        List<WebElement> totallists = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
        //int position = 0;
        Thread.sleep(3000);

        for (WebElement list : totallists) {
            String text = list.getText();
            System.out.println(text);

            if (text.equalsIgnoreCase("anaconda lyrics")) {
                list.click();
                break;

            /*position++;

            if (position==3){
                list.click();break;*/
            }
        }
    }
}
