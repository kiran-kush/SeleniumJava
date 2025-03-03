package org.example.Ex_19102024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium25 {
    @Test
    public void testLoginPageNegative(){
    EdgeOptions options= new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--guest");
    WebDriver driver=new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
    // Assert.assertEquals(driver.getTitle(),"Login-VWO");
       // link text and partial text works with a tag
        // link text- full match
        // partial text- aprtial text
       // WebElement linkTextClick= driver.findElement(By.linkText("Start a free trial"));
       // linkTextClick.click();
        WebElement partialLinkText= driver.findElement(By.partialLinkText("free trial"));
                   partialLinkText.click();
           driver.quit();







}

}
