package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

import java.io.File;
import java.util.logging.FileHandler;

public class SeleniumHandsOn5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        //ChromeOptions options= new ChromeOptions();
        //options.addArguments("start-maximized");
        //options.addArguments("--disable-notifications");


        // Get correct driver for desire browser
        //File chromeFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        //WebDriver myDriver = new ChromeDriver(options);
        //aqui chrome

        String browser = "firefox";
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
        Thread.sleep(3000);

        WebElement searchTextBoxGroup = myDriver.findElement(By.name("q"));
        searchTextBoxGroup.sendKeys("QA Minds Lab");
        searchTextBoxGroup.sendKeys(Keys.ENTER);
        //firefox
        Thread.sleep(5000);
        WebElement searchQAMinds=myDriver.findElement(By.xpath("//div[text()='QA Minds Lab']"));
        searchQAMinds.click();
        Thread.sleep(5000);
        WebElement searchCommentinQAminds = myDriver.findElement(By.xpath("//*[@name='xhpc_message_text']"));
        searchCommentinQAminds.sendKeys("Mensaje de firefox");
        Thread.sleep(2000);
        WebElement buttonPost=myDriver.findElement(By.xpath("//button[@data-testid='react-composer-post-button']"));
        buttonPost.click();
        // Wait some seconds
        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();
    }
}
