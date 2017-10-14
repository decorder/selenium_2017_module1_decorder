package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import java.io.File;
import java.util.List;
import java.util.logging.FileHandler;

public class SeleniumHandsOn6 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        ChromeOptions options= new ChromeOptions();
        //options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");


        // Get correct driver for desire browser
        File chromeFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver(options);
        //aqui chrome

        // Define which browser to use
        //String browser = "firefox";

        // Get correct driver for desire browser
        //WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.wikipedia.org");

        // Wait some seconds
        Thread.sleep(5000);
        System.out.println(myDriver.getCurrentUrl());

        WebElement searchTextBox = myDriver.findElement(By.id("searchInput"));
        searchTextBox.sendKeys("NBA");
        searchTextBox.sendKeys(Keys.ENTER);

        WebElement elementoaBuscar= myDriver.findElement(By.tagName("body"));

        List<WebElement> myList = elementoaBuscar.findElements(By.tagName("p"));
        int i=0;
        for (i=0; i<myList.size(); i++)
            System.out.println(myList.get(i));

        System.out.println(i);
        // Wait some seconds
        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();
    }
}
