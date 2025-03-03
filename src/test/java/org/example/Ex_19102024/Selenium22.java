package org.example.Ex_19102024;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium22 {
    public static void main(String[] args) {
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver= new EdgeDriver(edgeOptions);
        Proxy proxy= new Proxy();
        proxy.setHttpProxy("1080.255.245.1080");
        edgeOptions.setCapability("Proxy", proxy);
        driver.get("https://whatismyipaddress.com/");
        driver.manage().window().maximize();


    }
}
