package org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WwPomLao {
@Test
    public void getLoginandUpdate(){

        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.phptravels.net/login");

        LoginObjects.getEmail(driver).sendKeys("user@phptravels.com");
        LoginObjects.getPassword(driver).sendKeys("demouser");
        LoginObjects.getSubmit(driver).click();

        ProfileObjects.getProfile(driver).click();
        ProfileObjects.getState(driver).sendKeys("TamilNadu");
        ProfileObjects.getCity(driver).sendKeys("Ramnad");

            //WITHOUT MAKING OBJECTS CLASS' METHODS AS STATIC -2

        /*LoginObjects enterlogindata = new LoginObjects();
        enterlogindata.getemail(driver).sendKeys("user@phptravels.com");
        enterlogindata.getpassword(driver).sendKeys("demouser");
        enterlogindata.getsubmit(driver).click();*/


        //USUAL METHOD - 1
      /*  WebElement email = driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
        email.sendKeys("user@phptravels.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("demouser");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
        submit.click();*/

    }
}
