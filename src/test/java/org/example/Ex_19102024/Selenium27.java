package org.example.Ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium27 {

    @Description("Verify the erromessage on start a free Trial")
    @Test
    public void testStartFreeTrial() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://vwo.com/free-trial/");
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("979797090.com");

        WebElement checkPolicy= driver.findElement(By.name("gdpr_consent_checkbox"));
                checkPolicy.click();

        List<WebElement> buttonList= driver.findElements(By.tagName("button"));
        buttonList.get(0).click();
        Thread.sleep(3000);

        WebElement errorMessage= driver.findElement(By.className("invalid-reason"));
        System.out.println(errorMessage.getText());

        Assert.assertEquals(errorMessage.getText(),"The email address you entered is incorrect.");
        driver.quit();



    }
}
