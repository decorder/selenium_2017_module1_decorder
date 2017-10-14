package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");

        // Wait some seconds
        Thread.sleep(5000);
        System.out.println(myDriver.getCurrentUrl());

        WebElement searchTextBox = myDriver.findElement(By.id("lst-ib"));
        searchTextBox.sendKeys("Diego Cordero");
        searchTextBox.sendKeys(Keys.ENTER);

        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
