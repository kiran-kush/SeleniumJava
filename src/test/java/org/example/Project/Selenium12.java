package org.example.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium12 {
    @Test
    public void testvwoLogin(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start--maximaized");

        WebDriver driver= new EdgeDriver();
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();




    }

}
