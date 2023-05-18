package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class svetofor {
    WebDriver driver = new ChromeDriver();
    @Before
    public void beforeTest(){
        driver.get("https://svetoforonline.ru/");
    }
    @Test
    public void test(){
        WebElement webElement1 = driver.findElement(new By.ByClassName("grid_3"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(new By.ByCssSelector("div.but"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(new By.ById("cart"));
        webElement3.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement webElement4 = driver.findElement(new By.ByClassName("mini-cart-next"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(new By.ByClassName("fa-times"));
        webElement5.click();
    }
    @After
    public void afterTest(){
        driver.quit();
    }
}
