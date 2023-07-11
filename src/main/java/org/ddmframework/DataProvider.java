package org.ddmframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//ddm.xml
public class DataProvider {

   Object [][] inputs = new String[][]{
        {"Admin","admin123"},
        {"dummy","admin123"},
        {"Admin","dummy"},
        {"dummy","dummy"}
    };
   WebDriver driver;
    @org.testng.annotations.DataProvider(name = "Data")
    public Object[][] logindataprovider(){
        return inputs;
    }


    @Test(dataProvider = "Data")
    public void loginfunctionality(String valueone,String valuetwo) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--start-maximized");

        driver = new ChromeDriver(option);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

         WebElement username = driver.findElement(By.name("username"));
         username.sendKeys(valueone);

         WebElement password = driver.findElement(By.name("password"));
         password.sendKeys(valuetwo);

         WebElement button = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
         button.click();

    }

}
