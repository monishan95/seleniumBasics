package org.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WwLinksLao {
 public static void main(String[]args){
     System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
     WebDriver linkobject = new ChromeDriver();

     linkobject.get("https://us.vwr.com/store/catalog/vwr_products.jsp");//EXAMPLE1
     linkobject.findElement(By.linkText ("Antibodies")).click();
     linkobject.findElement(By.partialLinkText("Automated")).click(); //partial link text - liquid handling comes first, NA is second
     linkobject.quit();
     linkobject.get("https://www.leafground.com/link.xhtml"); //EXAMPLE 2
     linkobject.findElement(By.linkText("Go to Dashboard")).click();


 }
}
