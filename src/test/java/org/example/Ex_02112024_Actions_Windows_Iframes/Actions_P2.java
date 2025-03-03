package org.example.Ex_02112024_Actions_Windows_Iframes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_P2 {

    @Description ("this is for actions demo")
    @Test
    public void Actions_Demo(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start--maximized");

        WebDriver driver= new EdgeDriver();
        String URL= ("https://www.spicejet.com/");
        driver.get(URL);
        driver.manage().window().maximize();
        WebElement source= driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        Actions action= new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(source, "blr").keyUp(Keys.SHIFT).build().perform();







    }


}
