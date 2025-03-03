package org.example.Ex_19102024;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium16 {
    public static void main(String[] args) {
        // Inportant conceptsof oops in selenium

        //WebDriver driver1= new EdgeDriver();
        //WebDriver driver2= new ChromeDriver();
        //WebDriver driver3= new FirefoxDriver();
        //WebDriver driver4= new InternetExplorerDriver();
        //WebDriver driver5= new SafariDriver();

        //WebDriver driver1= new OperaDriver// Depricated from selenium
        //WebDriver driver1= new ChromeDriver();

        // SearchContext(I)- 2
        //WebDriver(I)- 10
        // RemoteDriver= 15
        // ChromiumDriver(c)-25
           //- EdgeDriver(c)-(45)
           //-ChromeDriver(c)-

        SearchContext driver= new EdgeDriver();
        // this concept is also known as dynamic dispatch, upcasting, downcasting;


        // Sceanrios: When to use what
        // When you want to use only edge or chrome
        EdgeDriver driver1= new EdgeDriver();
        ChromeDriver ch= new ChromeDriver();
        // when you want to run on chrome and change the browser at runtime
        WebDriver driver2= new ChromeDriver();
        driver2= new EdgeDriver();
        // do you want to run the test cases on multile machine
       // RemoteWebDriver remoteWebDriver= new RemoteWebDriver();






    }
}
