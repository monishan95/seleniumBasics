package org.SeleniumBasics;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.CheckForNull;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasicsSeProjectWaits {
    public static void main(String[]args) throws AWTException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\PersonalSoftwares\\WebDrivers\\Chrome\\chromedriver.exe");

        ChromeOptions obj = new ChromeOptions();
        obj.addArguments("--start-maximized"); //3 - maximize

        WebDriver driver = new ChromeDriver(obj);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.com/");

        WebElement acceptobj = driver.findElement(By.xpath("//*[@id=\'L2AGLb\']/div"));
        acceptobj.click();

        // SCREENSHOT - 2 METHODS

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourcefile =  screenshot.getScreenshotAs(OutputType.FILE);
        File destfile = new File("C:\\Users\\Sathiskumar\\OneDrive\\Pictures\\sample.png");
        FileHandler.copy(sourcefile,destfile);


        Robot robot = new Robot();
        java.awt.Dimension dims = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(dims);
        BufferedImage source = robot.createScreenCapture(rectangle);
        File destfile1 = new File("C:\\Users\\Sathiskumar\\OneDrive\\Pictures\\robot.png");
        ImageIO.write(source,"png",destfile1);


        //DIFF WAYS TO MAXIMIZE - 3 in total

        driver.manage().window().maximize(); //1

        Dimension dimensions = new Dimension(1366,786);//2 -can set any size - resizing
        driver.manage().window().setSize(dimensions);


        WebDriverWait waiting = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement profile = waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        profile.click(); //EXPLICITLY WAIT

        //FLUENT WAIT

        Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

       WebElement profile1 = wait.until(new Function<WebDriver, WebElement>() {
           @Override
           public WebElement apply(WebDriver profile) {
               return profile.findElement(By.xpath(""));
           }
       });
       profile.click();

       TakesScreenshot scrsht = (TakesScreenshot) driver;
       File inp = scrsht.getScreenshotAs(OutputType.FILE);
       File out = new File("");
       FileHandler.copy(inp,out);

       Robot rob = new Robot();
        java.awt.Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rle = new Rectangle(dim);
        BufferedImage inpt = rob.createScreenCapture(rle);
        File opt = new File("");
        ImageIO.write(inpt,"png",opt);

        driver.manage().window().maximize();

        Dimension dimns = new Dimension(1366,786);
        driver.manage().window().setSize(dimns);

        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--start-maximized");

        WebDriver dru = new ChromeDriver(opts);

        JavascriptExecutor exec = (JavascriptExecutor) dru;
        exec.executeScript("locate.reload()"); //"history.go(0)"

        Wait <WebDriver> theobject = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement click = theobject.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver click) {
                return click.findElement(By.xpath(""));
            }
        });

        click.click();

        Robot therobot = new Robot();
        java.awt.Dimension dis = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectobt = new Rectangle(dis);
        BufferedImage soce = therobot.createScreenCapture(rectobt);
        File ot = new File("");
        ImageIO.write(soce,"png",ot);





    }

}
