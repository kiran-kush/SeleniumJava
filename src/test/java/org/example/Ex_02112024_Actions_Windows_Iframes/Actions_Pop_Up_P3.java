package org.example.Ex_02112024_Actions_Windows_Iframes;

import com.beust.ah.A;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class Actions_Pop_Up_P3 {

    @Description ("this is for actions demo")
    @Test
    public void Actions_Demo(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start--maximized");

        WebDriver driver= new EdgeDriver();
        String URL= ("https://www.makemytrip.com/");
        driver.get(URL);
        driver.manage().window().maximize();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@data-cy=\"closeModal\"]")));
        driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
         WebElement Fromcity= driver.findElement(By.id("fromCity"));
         Actions action= new Actions(driver);
         action.moveToElement(Fromcity).click().sendKeys("NewDelhi").build().perform();
         //List<WebElement> list_auto_complete= driver.findElements(By.xpath());








    }


}
