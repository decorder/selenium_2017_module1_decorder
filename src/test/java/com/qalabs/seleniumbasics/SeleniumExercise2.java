package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.informador.mx");
        //get Title
        System.out.println(myDriver.getTitle());
        //print current URL
        System.out.println(myDriver.getCurrentUrl());
        //print Source Code
        System.out.println(myDriver.getPageSource());
        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
