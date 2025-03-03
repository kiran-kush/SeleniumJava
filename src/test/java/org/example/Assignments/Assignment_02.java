package org.example.Assignments;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_02 {
    @Description("Verify the resgistration page")
    @Test
    public void testRegistrationForm(){
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--Start-maxmized");
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--Incognito");
        WebDriver driver= new EdgeDriver(edgeOptions);
        // Launch the  URL
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        //Enter first name
        driver.manage().window().maximize();

        WebElement inputBoxFirstName= driver.findElement(By.id("input-firstname"));


        inputBoxFirstName.sendKeys("Test Demo");
        //Enter Last name
        WebElement inputBoxLastName= driver.findElement(By.name("lastname"));
        inputBoxLastName.sendKeys("test");
        //Enter email
        WebElement inputBoxEmail= driver.findElement(By.id("input-email"));
        inputBoxEmail.sendKeys("test808@gmail.com");

        // Enter phone number
        WebElement inputBoxPhone= driver.findElement(By.name("telephone"));
        inputBoxPhone.sendKeys("0980980980");
        // Enter Password
        WebElement inputPassword= driver.findElement(By.id("input-password"));
        inputPassword.sendKeys("abc123#");
        // Confirm the entered email
        WebElement conifrmPassword= driver.findElement(By.name("confirm"));
        conifrmPassword.sendKeys("abc123#");
        // Accept Terms and continue
        WebElement acceptTerms= driver.findElement(By.name("agree"));
        acceptTerms.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // Click on continue button
        WebElement button= driver.findElement(By.xpath("//input[@value='Continue']"));
        button.click();
        // GEt the confirmation message

        WebElement confirmMessage= driver.findElement(By.id("content"));
        System.out.println(confirmMessage.getText());
      /*  String text= "Your Account Has Been Created! Congratulations! Your new account has been successfully created+
                 "You can now take advantage of member privileges to enhance your online shopping experience with us"
                "If you have ANY questions about the operation of this online shop, please e-mail the store owner.
                "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.
                "Continue"
        Assert.assertEquals(confirmMessage.getText(), "Your Account Has Been Created!" +
                "Congratulations! Your new account has been successfully created!" +
                "\n" +
                "You can now take advantage of member privileges to enhance your online shopping experience with us.\n" +
                "\n" +
                "If you have ANY questions about the operation of this online shop, please e-mail the store owner.\n" +
                "\n" +
                "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.");

                 // close the browser
        driver.quit(); */




    }
}
