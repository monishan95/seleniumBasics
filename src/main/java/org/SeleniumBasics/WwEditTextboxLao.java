package org.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WwEditTextboxLao {
    public static void main (String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\\\PersonalSoftwares\\\\WebDrivers\\\\Chrome\\\\chromedriver.exe");

        ChromeOptions cropt = new ChromeOptions();
        cropt.addArguments("--start-maximized");

        WebDriver textboxobject = new ChromeDriver(cropt);
        textboxobject.navigate().to("https://www.leafground.com/input.xhtml");

        WebElement namebox = textboxobject.findElement(By.id("j_idt88:name"));
        namebox.sendKeys("Monisha Shanmugam");

        WebElement append = textboxobject.findElement(By.id("j_idt88:j_idt91"));
        append.sendKeys(" , India.");

        WebElement Disabledchking = textboxobject.findElement(By.xpath("//*[@id=\'j_idt88\']/div[3]/div"));
        Boolean output = Disabledchking.isEnabled();
        System.out.println(output);

        WebElement clearbox = textboxobject.findElement(By.id("j_idt88:j_idt95"));
        clearbox.clear();

        WebElement gettextbox = textboxobject.findElement(By.id("j_idt88:j_idt97"));
        String text = gettextbox.getAttribute("value");
        System.out.println(text);

        WebElement tabcheck = textboxobject.findElement(By.id("j_idt88:j_idt99"));
        tabcheck.sendKeys(("xyz@abc.com")+Keys.TAB);

        WebElement Descbox = textboxobject.findElement(By.id("j_idt88:j_idt101"));
        Descbox.sendKeys("En purusan dan Sathis matum dan");

        WebElement clearingappend = textboxobject.findElement(By.id("j_idt88:j_idt91"));
        clearingappend.clear();

        WebElement newtextappend = textboxobject.findElement(By.id("j_idt88:j_idt91"));
        newtextappend.sendKeys("London , UK");

        WebElement error = textboxobject.findElement(By.id("j_idt106:thisform:age"));
        error.sendKeys(Keys.ENTER);

        WebElement editanddd = textboxobject.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete_input\']"));
        editanddd.sendKeys("moni"+Keys.ENTER);
        /*Select selectobj = new Select(editanddd);
        selectobj.selectByIndex(2);//DOUBT*/

        WebElement select = textboxobject.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete_input\']"));

        List<WebElement> options = select.findElements(By.tagName("li"));

        for (WebElement option1 : options) {

            if("moni3".equals(option1.getText().trim())) {
                option1.click();
            }


        }


    }

}
