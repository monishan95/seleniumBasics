package org.SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WwChkboxesLao {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\chromedriver.exe");
        WebDriver chkboxobject = new ChromeDriver();
        chkboxobject.get("https://www.leafground.com/checkbox.xhtml");

        WebElement basicbox = chkboxobject.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
        basicbox.click();

        WebElement chkdisabled = chkboxobject.findElement(By.id("j_idt87:j_idt102"));
        Boolean status =  chkdisabled.isEnabled();
        System.out.println("Disbled status is "+ status);

        WebElement tristate = chkboxobject.findElement(By.xpath("//*[@id=\'j_idt87:ajaxTriState\']/div[2]"));
        tristate.click();
        tristate.click();
        tristate.click();


        WebElement multiple = chkboxobject.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
        multiple.click();
        WebElement miami = chkboxobject.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]"));
        miami.click(); //DOUBT


        WebElement toggle = chkboxobject.findElement(By.xpath("//*[@id=\'j_idt87:j_idt100\']/div[2]"));
        toggle.click();
    }
}
