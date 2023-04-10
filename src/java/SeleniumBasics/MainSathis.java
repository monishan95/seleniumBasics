package org.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSathis {
    public static void main(String[] args) {
        // Optional to set the Driver - Handled by Selenium Manager
        //System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

/*
        // Chrome

        System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        //Firefox

        System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

        WebDriver driver1 = new FirefoxDriver();

        //Microsoft Edge

        System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

        WebDriver driver2 = new EdgeDriver();
*/


        System.setProperty("webdriver.chrome.driver","C:\\\\PersonalSoftwares\\\\WebDrivers\\\\Chrome\\\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.shellenergy.co.uk/");
        // Thread wait 5 Seconds
       //chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        chromeDriver.findElement(By.ById.id("_evidon-accept-button")).click();
        chromeDriver.findElement(By.ByLinkText.linkText("Login")).click();
        //chromeDriver.close(); --- Close the Last Session Tab
        // chromeDriver.quit(); -- Close all the tabs opened by selenium

        chromeDriver.findElement(By.ById.id("email")).sendKeys("sathiskumar.naganathan@gmail.com");
        chromeDriver.findElement(By.ByName.name("userPassword")).sendKeys("Twinkle-123");
        chromeDriver.findElement(By.className("button-primary")).click();
    }

    //<a href="/account/switch" class="jsx-2530461030 jsx-4062093044 menu__login-btn">Login</a>
}