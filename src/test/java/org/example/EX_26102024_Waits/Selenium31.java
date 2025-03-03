package org.example.EX_26102024_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium31 {
    @Description ("Verify Ebay print the prices")
    @Test
    public void test_verify_prices_of_iMac() throws InterruptedException {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start_maximized--");



        EdgeDriver edgeDriver= new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        edgeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       WebElement searchBox= edgeDriver.findElement(By.cssSelector("input[id=gh-ac]"));
        searchBox.sendKeys("Macmini");
        WebElement search_button= edgeDriver.findElement(By.xpath("//button [@type= 'submit']"));
        search_button.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // print all the titles
        List<WebElement> SearchTitles = edgeDriver.findElements(By.cssSelector("div.s-item__title span"));
        //xpath- //div[@class="s-item__titel"]/span
        // print prices
        List<WebElement> SearchTitlePrices= edgeDriver.findElements(By.cssSelector("span.s-item__price"));
        int size= Math.min(SearchTitlePrices.size(),SearchTitles.size());
        for(int i=0; i<size;i++){
            System.out.println("Titles:"+ SearchTitles.get(i).getText()+ "| |" +"Prices"+SearchTitlePrices.get(i).getText());
            System.out.println();
           // int temp= Search;
            //if(SearchTitlePrices.get(i));

        }






        edgeDriver.quit();

    }

}
