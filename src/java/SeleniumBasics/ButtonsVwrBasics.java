package org.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsVwrBasics {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");
        WebDriver vwrbuttons = new ChromeDriver();
        vwrbuttons.navigate().to("https://us.vwr.com/store/product/4524160/vwr-premium-aluminum-foil");

        //SIZE OF DOCUMENTATION BUTTON

        WebElement buttonsize = vwrbuttons.findElement(By.className("nav-link"));
        int height = buttonsize.getSize().getHeight();
        int width = buttonsize.getSize().getWidth();
        System.out.println("height= "+height+"width = "+width);

        //COLOR OF ORDER NOW BUTTON

        WebElement color = vwrbuttons.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/div[1]/div[2]/div[2]/div/a"));
        String thecolour = color.getCssValue("background-color");
        System.out.println("The button is in "+thecolour+"color");

        //LOCATION OF Q AND A BUTTON
        WebElement location = vwrbuttons.findElement(By.xpath("//*[@id=\'tabs-0\']/li[3]/a"));
        Point xandy = location.getLocation();
        int x= xandy.getX();
        int y= xandy.getY();
        System.out.println("co-ordinates are "+ x + " and " + y);

        //GO BACK TO HOME
        /*vwrbuttons.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement gohome = vwrbuttons.findElement(By.linkText("VWR,part of Avantor"));
        gohome.click();*/

    }

}
