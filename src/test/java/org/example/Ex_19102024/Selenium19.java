package org.example.Ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium19 {
    @Test
    public void demoCloseQuit(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.close();// closes current window or tab
        driver.quit();// closes the whole browser and session does not exists.



    }
}
