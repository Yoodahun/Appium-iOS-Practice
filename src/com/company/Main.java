package com.company;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;


public class Main extends Base {

    public static void main(String[] args) throws InterruptedException {
	// Setting DesiredCapabilities

        IOSDriver<IOSElement> driver = capabilities();

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@name='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello world");
        driver.findElementByName("OK").click();
        driver.quit();

        //Scrolling
        driver = capabilities();
        Thread.sleep(3000);
        IOSElement element = driver.findElementByClassName("XCUIElementTypeTable");
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
        scrollObject.put("predicateString", "label == \"Search Bars\"");
        driver.executeScript("mobile:scroll", scrollObject);







    }
}
