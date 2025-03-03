package org.example.Ex_19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium26 {
    @Description("Verify with invalid email and password, error message is displayed")
    @Test
    public void testVOWLoginwith(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        WebElement gender= driver.findElement(By.id("sex-0"));
        gender.click();



    }
}
