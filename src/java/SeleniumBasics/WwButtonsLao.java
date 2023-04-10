package org.SeleniumBasics;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.chrome.ChromeOptions;
 import org.openqa.selenium.interactions.Actions;

public class WwButtonsLao {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.leafground.com/button.xhtml");


        Dimension dimensions = new Dimension(1366,786);
        driver.manage().window().setSize(dimensions);

        WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xypoint = position.getLocation();
        int xvalue = xypoint.getX();
        int yvalue = xypoint.getY();
        System.out.println("X value = " + xvalue + "," + "Y value = " + yvalue);

        WebElement color = driver.findElement(By.id("j_idt88:j_idt96"));
        String buttoncolour = color.getCssValue("background");
        System.out.println("The color is " + buttoncolour);

        WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = size.getSize().getHeight();
        int width = size.getSize().getWidth();
        System.out.println("Height is " + height + " Width is  "+ width);

        WebElement enablecheck = driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div/div[1]/div[2]"));
        Boolean result = enablecheck.isEnabled();
        System.out.println(result);

        WebElement colorchangebutton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"));

        String beforehovering = colorchangebutton.getCssValue("background");
        System.out.println(beforehovering);

        Actions action = new Actions(driver);
        action.moveToElement(colorchangebutton).perform();

        String afterhovering = colorchangebutton.getCssValue("background");
        System.out.println(afterhovering);



        /*WebElement homepage = driver.findElement(By.id("j_idt88:j_idt90"));
        homepage.click();*/


    }
}
