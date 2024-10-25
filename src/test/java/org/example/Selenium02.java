package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02 {

    // code written in java, ruby, pearl, python,
    // gets converted into http request via jsonwire protocol,
    // which later submitted to the browser driver
    // browser driver gives it to browser to perform certain task
    // client server architecture
    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");
        driver.quit();

    }

}
