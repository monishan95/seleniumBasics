package org.SeleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class WwDragandDropLao {
    public static void main(String[]args){
        ChromeOptions cropts = new ChromeOptions();
        cropts.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(cropts);

        driver.navigate().to("https://www.leafground.com/drag.xhtml");

        WebElement dragelement = driver.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
        WebElement dropelement = driver.findElement(By.xpath("//*[@id=\'form:drop_content\']/p"));

        Actions object = new Actions(driver);
        object.clickAndHold(dragelement).moveToElement(dropelement).release(dropelement).build().perform();
        object.dragAndDrop(dragelement,dropelement).build().perform();




    }
}
