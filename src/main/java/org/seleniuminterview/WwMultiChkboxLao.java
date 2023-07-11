package org.seleniuminterview;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class WwMultiChkboxLao {


    public static void main(String[] args) {

        ChromeOptions maximize = new ChromeOptions();
        maximize.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(maximize);
        driver.get("https://us.vwr.com/store/category/clamps/547930");


        List <WebElement> allchkboxes = driver.findElements(By.xpath("//ul[@class='list-unstyled mb-0']//following::li//following::span"));

        for (WebElement chkbox:allchkboxes) {
            chkbox.click();
        }
    }
}
