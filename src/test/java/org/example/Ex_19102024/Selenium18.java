package org.example.Ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium18 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.getCurrentUrl();
        driver.getTitle();
        driver.getPageSource().contains("CURA Healthcare Service");

    }
}

