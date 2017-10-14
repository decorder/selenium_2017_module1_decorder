package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.facebook.com");

        // Wait some seconds
        Thread.sleep(5000);
        System.out.println(myDriver.getCurrentUrl());

        WebElement searchTextBoxEmail = myDriver.findElement(By.id("email"));
        searchTextBoxEmail.sendKeys("juan.tester.123@gmail.com");

        WebElement searchTextBoxPass = myDriver.findElement(By.id("pass"));
        searchTextBoxPass.sendKeys("tester123");

        WebElement searchButtonLogin = myDriver.findElement(By.id("loginbutton"));
        searchButtonLogin.click();

        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
