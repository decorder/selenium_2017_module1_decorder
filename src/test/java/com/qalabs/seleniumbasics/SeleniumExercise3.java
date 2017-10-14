package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.mx");
        //get Title
        System.out.println(String.format("primer pagina %s", myDriver.getCurrentUrl()));
        Thread.sleep(5000);
        //print current URL
        myDriver.navigate().to("https://www.facebook.com");
        System.out.println(String.format("segunda pagina %s", myDriver.getCurrentUrl()));
        Thread.sleep(1000);
        myDriver.navigate().to("https://www.ESPN.com");
        System.out.println(String.format("tercer pagina %s", myDriver.getCurrentUrl()));
        Thread.sleep(1000);
        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println(String.format("dos paginas atras %s", myDriver.getCurrentUrl()));
        Thread.sleep(1000);
        //print Source Code
        myDriver.navigate().forward();
        System.out.println(String.format("una adelante %s", myDriver.getCurrentUrl()));
        Thread.sleep(1000);
        myDriver.navigate().refresh();
        System.out.println(String.format("refresh %s", myDriver.getCurrentUrl()));


        // Quit web driver
        myDriver.quit();
    }


}
