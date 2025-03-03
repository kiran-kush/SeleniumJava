package org.example.EX_26102024_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium33 {

    @Description("Verify the error message for incorrect details")
    @Test
    public void testVWOLoginNegetive() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement email= driver.findElement(By.name("username"));
        email.sendKeys("7xwingyfy.com");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("1234");

       /* WebElement checkPolicy= driver.findElement(By.name("gdpr_consent_checkbox"));
                checkPolicy.click();*/

        WebElement button= driver.findElement(By.id("js-login-btn"));
        button.click();
       // buttonList.get(0).click();
        WebElement errorMessage= driver.findElement(By.className("notification-box-description"));
        System.out.println(errorMessage.getText());

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));


       // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait\
        .until(ExpectedConditions.textToBePresentInElement(errorMessage,"Your email, password, IP address or location did not match"));



        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");
        driver.quit();




    }
}
