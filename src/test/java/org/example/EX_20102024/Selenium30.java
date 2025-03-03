package org.example.EX_20102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium30 {
    //Locators- find the webelement
    //Open the URL- "https://app.vwo.com/#/login"
    // FInd the email id
    // enter the email id
    // find the password field
    // enter the password as admin
    // verify the error message shown
    @Description("Verify that invalid email and password message is shown")
    @Test
    public void testVWOLoginNegative() throws InterruptedException {
        // total -7 id locators
        // id, name, class name, link text and partial link
        // css and xpath- advanced
        // Prefrence Rule- Id- name-> class name- link text-> partial link, Css selector and xpath
        EdgeOptions options= new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--guest");
        WebDriver driver=new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
       // Assert.assertEquals(driver.getTitle(),"Login-VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        // find the element Inputbox and enter the id
        WebElement emailInputBox= driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");
        // find the element and enter the password
        WebElement passowrdInputbox= driver.findElement(By.name("password"));
        passowrdInputbox.sendKeys("abc.123");


        WebElement submitbutton= driver.findElement(By.id("js-login-btn"));
        submitbutton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_Message_Text= driver.findElement(By.id("js-notification-box-msg"));
           Assert.assertEquals(error_Message_Text.getText(), "Your email, password, IP address or location did not match");

           driver.quit();







    }

}
