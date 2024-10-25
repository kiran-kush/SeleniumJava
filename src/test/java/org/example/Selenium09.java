package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;

public class Selenium09 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/org/example/Addblock.crx"));
        EdgeDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://sdet.live");


    }

}
