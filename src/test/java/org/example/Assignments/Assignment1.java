package org.example.Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {
    @Test
    public  void testKatalonDemo(){

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--incognito");
        WebDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        String pageSource= driver.getPageSource();
        if(pageSource.contains("CURA Healthcare Service")){
            System.out.println("title is:"+ pageSource);
            Assert.assertEquals(pageSource,"CURA Healthcare Service");
        }
    }

}
