package org.SeleniumAdvanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WwWindowsLao {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");

        driver.manage().window().maximize();

        String oldwindow = driver.getWindowHandle();

        WebElement button1 = driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
        button1.click();
        driver.switchTo().window(oldwindow);
        WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input"));
        searchbar.sendKeys("nothing to search");
        //driver.close();
        /*Set<String> allwindows =  driver.getWindowHandles();

        for (String newwindow:allwindows) {

           // driver.switchTo().window(newwindow);
            *//*Thread.sleep(3000);
            WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input"));
            searchbar.sendKeys("nothing to search");*//*

            //



            //driver.switchTo().defaultContent();

          *//*  WebElement multiple = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
            multiple.click();

            int count = driver.getWindowHandles().size();
            System.out.println("windows total  "+ count);*//*
        }*/

    }

}
