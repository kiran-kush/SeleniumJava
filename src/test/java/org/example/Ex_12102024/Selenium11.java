package org.example.Ex_12102024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium11 {

    @Test
    public void getVsNavigate(){

        EdgeDriver driver= new EdgeDriver();
        driver.get("https://sdet.live");

        driver.navigate().to("https://sdet.live");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        // to navigate to backward and forwards
        // navigate





    }
}
