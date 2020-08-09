package com.company;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;

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
        RemoteWebElement element = (RemoteWebElement)driver.findElement(By.className("XCUIElementTypeTable"));
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();

        scrollObject.put("direction", "down");
        driver.executeScript("mobile:scroll", scrollObject);

        driver.findElementByAccessibilityId("Steppers").click();

        //Increment
        driver.findElementsByAccessibilityId("Increment").get(0).click();
        driver.findElementsByAccessibilityId("Increment").get(0).click();

        driver.findElementsByAccessibilityId("Increment").get(1).click();

        //Static Text
        System.out.println(
                driver.findElementByName("DEFAULT").getAttribute("name")
        );
        //print text
        System.out.println(
                driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText()
        );

        driver.navigate().back();
        driver.findElementByAccessibilityId("Picker View").click();

        //Select Wheel Picker
        driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("55");
        driver.findElementsByClassName("XCUIElementTypePickerWheel").get(1).sendKeys("220");
        driver.findElementsByClassName("XCUIElementTypePickerWheel").get(2).sendKeys("130");



    }
}
