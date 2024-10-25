package org.example.Ex_12102024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium10 {
    @Test
    public void testQuitVsClose(){
        EdgeDriver driver= new EdgeDriver();
        driver.get("https://sdet.live");
        driver.close();
        // close the current window and no
        // session id != null and
        //error- invalid session id( session still exists but invalid)

        driver.quit();
        // it closes the current window- not the full window
        // session id= null
        // session id not present as it is deleted



    }
}
