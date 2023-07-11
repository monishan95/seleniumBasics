package org.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindbyObjects {

    @FindBy(xpath = "//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input")
    public static WebElement email;

    @FindBy(how = How.NAME,using = "password")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
    public static WebElement submit;

    @FindBy(xpath = "//*[@id=\'fadein\']/div[4]/div/div[3]/ul/li[4]/a")
    public static WebElement profile;
    @FindBy(xpath = "//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[8]/td[3]/div/input")
    public static WebElement city;

    @FindBy(xpath = "//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[7]/td[3]/div/input")
    public static WebElement State;

}
