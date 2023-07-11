package org.seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WwUnderlineCheckLao {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        driver.manage().window().maximize();

        WebElement reject = driver.findElement(By.xpath("//*[@id=\'W0wltc\']/div"));
        reject.click();

        WebElement aboutbutton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]"));

        String before = aboutbutton.getCssValue("text-decoration");
        System.out.println(before);

        Actions action = new Actions(driver);
        action.moveToElement(aboutbutton).perform();

        String after = aboutbutton.getCssValue("text-decoration");
        System.out.println(after);

    }

}
