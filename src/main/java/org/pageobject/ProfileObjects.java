package org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfileObjects {

    public static WebElement getProfile(WebDriver driver){
       return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[3]/ul/li[4]/a"));
    }

    public static WebElement getState(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[7]/td[3]/div/input"));
    }

    public static WebElement getCity(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[8]/td[3]/div/input"));

    }



}
