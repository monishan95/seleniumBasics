package org.SeleniumBasics;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseTextbrowser {

    public static void main(String[] args){
        //CHROME
     System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
     WebDriver browser = new ChromeDriver();
     browser.get("https://us.vwr.com/store/catalog/vwr_products.jsp");
     browser.findElement(By.id("keyword")).sendKeys("beakers"+ Keys.ENTER);//TEXTBOX

     browser.get("https://www.dinamalar.com/");
     //theobject.quit();

     //EDGE
        /*System.setProperty("webdriver.edge.driver","C:\\\\PersonalSoftwares\\\\WebDrivers\\\\Edge\\\\msedgedriver.exe");
             WebDriver edgeobject = new EdgeDriver();
             edgeobject.get("https://us.vwr.com/store/catalog/vwr_products.jsp");
             theobject.quit();*/




    }

}
