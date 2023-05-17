package org.example;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson6_step5 {
    WebDriver driver = new ChromeDriver();

        @Before
        public void beforeTest(){
            driver.get("http://suninjuly.github.io/find_link_text");
        }
        @Test
        public void Test(){
            int a = (int)Math.ceil(Math.pow(Math.PI, Math.E)*10000);
            String stringValue = Integer.toString(a);

            WebElement link = driver.findElement(new By.ByLinkText(stringValue));
            link.click();
            WebElement input1 = driver.findElement(new By.ByTagName("input"));
            input1.click();
            input1.sendKeys("Ivan");
            WebElement input2 = driver.findElement(new By.ByName("last_name"));
            input2.click();
            input2.sendKeys("Petrov");
            WebElement input3 = driver.findElement(new By.ByClassName("city"));
            input3.click();
            input3.sendKeys("Smolensk");
            WebElement input4 = driver.findElement(new By.ById("country"));
            input4.click();
            input4.sendKeys("Russia");
            WebElement submitBtn = driver.findElement(new By.ByCssSelector("button.btn"));
            submitBtn.click();
        }
        @After
        public void afterTest(){
            driver.quit();
        }
}
