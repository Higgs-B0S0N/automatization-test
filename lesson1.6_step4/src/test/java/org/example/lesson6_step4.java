package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson6_step4 {
    WebDriver driver = new ChromeDriver();
    @Before
    public void beforeTest(){
        driver.get("http://suninjuly.github.io/simple_form_find_task.html");
    }
    @Test
    public void test(){
        WebElement webElement1 = driver.findElement(new By.ByTagName("input"));
        webElement1.click();
        webElement1.sendKeys("Ivan");

        WebElement webElement2 = driver.findElement(new By.ByName("last_name"));
        webElement2.click();
        webElement2.sendKeys("Petrov");

        WebElement webElement3 = driver.findElement(new By.ByClassName("city"));
        webElement3.click();
        webElement3.sendKeys("Smolensk");

        WebElement webElement4 = driver.findElement(new By.ById("country"));
        webElement4.click();
        webElement4.sendKeys("Russia");

        WebElement submitBtn = driver.findElement(new By.ByCssSelector("button.btn"));
        submitBtn.click();
    }
    @After
    public void afterTest(){
        driver.quit();
    }
}
