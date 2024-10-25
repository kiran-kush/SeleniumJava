package org.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium03 {
    @Test
    public  void test001(){
        FirefoxDriver firefoxDriver= new FirefoxDriver();
        firefoxDriver.get("https://sdet.live");
        firefoxDriver.quit();


    }
}
