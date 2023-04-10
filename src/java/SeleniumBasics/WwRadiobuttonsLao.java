package org.SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WwRadiobuttonsLao {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");
        WebDriver radiobject = new ChromeDriver();
        radiobject.get("https://www.leafground.com/radio.xhtml");

        WebElement chrome = radiobject.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[1]/div/div[2]/span"));
        WebElement firefox= radiobject.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[2]/div/div[2]/span"));
        WebElement safari = radiobject.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]/span"));
        WebElement edge   = radiobject.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[4]/div/div[2]/span"));

        Boolean chromeop =  chrome.isSelected();
        Boolean firop    =  firefox.isSelected();
        Boolean safop    =  safari.isSelected(); // DOUBT - ALL SHOWS FALSE- SAFARI SHOULD BE TRUE
        Boolean edgeop = edge.isSelected();

        System.out.println("status of enabled is "+ chromeop );
        System.out.println("status of enabled is "+ firop );
        System.out.println("status of enabled is "+ safop );
        System.out.println("status of enabled is "+ edgeop );

        WebElement agegroup = radiobject.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]/span"));
        agegroup.click();

    }


}
