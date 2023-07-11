package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WwtooltipLao {
    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");

        WebElement acceptobj = driver.findElement(By.xpath("//*[@id=\'content\']/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
        acceptobj.click();

        //2 METHODS - USING ATTRIBUTE "title"
        WebElement mic = driver.findElement(By.xpath("//*[@id=\'voice-search-button\']/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
        String tooltiptext = mic.getAttribute("title");
        System.out.println(tooltiptext);

        //USING ACTIONS CLASS

        Actions actions = new Actions(driver);





    }


}
