package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");

        // Wait some seconds
        Thread.sleep(10000);
        System.out.println(myDriver.getCurrentUrl());

        WebElement searchTextBox = myDriver.findElement(By.id("twotabsearchtextbox"));
        searchTextBox.sendKeys("Selenium");
        searchTextBox.sendKeys(Keys.ENTER);

        // Wait some seconds
        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();
    }
}
