package com.company;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Keys;


public class SafariAutomation  extends Base {

    public static void main(String[] args) throws InterruptedException {

        IOSDriver<IOSElement> driver = capabilities();

        driver.get("https://www.gmail.com");
        driver.findElementById("identifierId").sendKeys("dahun4032@gmail.com");
        driver.findElementById("identifierId").sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        driver.get("https://www.google.com");
        driver.findElementByName("q").sendKeys("Appium");
        Thread.sleep(2000);
        driver.findElementByName("q").sendKeys(Keys.ENTER);




    }

}
