package org.wwTestNgLao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAfterSuite {

        WebDriver driver;
        long starttime,endtime;
    @BeforeSuite
    public void before(){

            starttime=System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
         driver = new ChromeDriver();
    }
    @Test
    public void getgoogle(){
            driver.get("https://www.google.com/");
    }
    @Test
    public void oneindia(){
            driver.get("https://tamil.oneindia.com/");
    }
    @Test
    public void getthehindu(){
            driver.get("https://www.thehindu.com/");
    }
    @AfterSuite
    public void after(){
        driver.quit();
        endtime = System.currentTimeMillis();
        long totaltimetaken = endtime-starttime;
        System.out.println(totaltimetaken+"  milliseconds");
    }
}
