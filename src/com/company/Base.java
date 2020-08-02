package com.company;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Base {

    public static IOSDriver<IOSElement> capabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        // Give the app path
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/yoodahun/Library/Developer/Xcode/DerivedData/UICatalog-effppdfezvunjcbqihlcghopzhgi/Build/Products/Debug-iphonesimulator/UICatalog.app");

        IOSDriver<IOSElement> driver = null;

        try {
            driver =  new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (Exception e) {

        }
        return  driver;
    }

}
