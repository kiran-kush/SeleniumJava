package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {

    @Test
    public void testethod01(){
        // EdgeOptions- it will help you to set the browser
        // to set the options to browsers
        // to start in maximize mode
        // to open in https, http mode
        // start in full UI mode- it is a default mode.
        // to add extension
        // to set local storage download
        // headless mode- no Ui and fast execution
        // can be used to open in incognito mode
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--window-size=800,600");

        EdgeDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://www.wiseradvisor.com/financial-advisors.asp");
        driver.quit();


    }
}
