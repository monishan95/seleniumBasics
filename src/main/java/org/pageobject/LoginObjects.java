package org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {

    public static WebElement getEmail(WebDriver driver){
      return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
    }

    public static WebElement getPassword(WebDriver driver){
       return driver.findElement(By.name("password"));
    }
    public static WebElement getSubmit(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
    }


}
