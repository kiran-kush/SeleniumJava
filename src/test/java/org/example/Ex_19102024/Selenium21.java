package org.example.Ex_19102024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Selenium21 {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("bing.com");// Https: protocol is must have
    }
}