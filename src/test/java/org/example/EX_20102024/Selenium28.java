package org.example.EX_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium28 {
    @Description ("Verify the start a free trial message expires")
    @Test
    public void test_verify_expire_message() throws InterruptedException {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start_maximized--");
        EdgeDriver edgeDriver= new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.idrive360.com/enterprise/login");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Input:
        // id="username"
        //xpath
        // //input[@type="email"]
        ////input[@name="username"]
        WebElement user_input_id= edgeDriver.findElement(By.id("username"));
//        WebElement user_input_xpath= edgeDriver.findElement(By.xpath("//input[@type='email']"));
//        WebElement user_input_name= edgeDriver.findElement(By.name("username"));
//        WebElement user_input_cssselector1= edgeDriver.findElement(By.cssSelector("input[type='email']"));
//        WebElement user_input_cssselector2= edgeDriver.findElement(By.cssSelector(("#usernname")));
        user_input_id.sendKeys("augtest_040823@idrive.com");
        WebElement password= edgeDriver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("123456");
        WebElement checkbox= edgeDriver.findElement(By.className("id-checkmark"));
        checkbox.click();
        WebElement button_submit=edgeDriver.findElement(By.cssSelector("div.id-frm-btnblk >button"));
        button_submit.click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // xpath=
        WebElement error_message_freetrial=edgeDriver.findElement(By.xpath("//h5[@class='id-card-title']"));
        Assert.assertEquals(error_message_freetrial.getText(),"Your free trial has expired");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        edgeDriver.quit();

    }

}
