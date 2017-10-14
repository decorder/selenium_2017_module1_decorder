package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);


        // Get google home page
        myDriver.get("https://www.youtube.com");
        // Wait some seconds
        Thread.sleep(3000);
        //firefox
        //WebElement searchTextBox = myDriver.findElement(By.id("search-container"));
        //chrome
        WebElement searchTextBox = myDriver.findElement(By.id("search"));
        System.out.println(String.format("Elemento localizado en %s esta desplegado? %s", searchTextBox.getLocation(),searchTextBox.isDisplayed()));
        System.out.println(String.format("Elemento localizado en %s esta habilitado? %s", searchTextBox.getLocation(),searchTextBox.isEnabled()));
        searchTextBox.sendKeys("Selenium");
        //chrome and firefox
        WebElement searchButton= myDriver.findElement(By.id("search-icon-legacy"));
        searchButton.click();
        Thread.sleep(5000);
        // Quit web driver
        myDriver.quit();
    }
}
