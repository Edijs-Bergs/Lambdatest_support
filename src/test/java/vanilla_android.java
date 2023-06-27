import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class vanilla_android {
    public static String userName = System.getenv("LambdaUserName");
    public static String accessKey = System.getenv("accessKey");

    private static AppiumDriver driver;

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Galaxy S20");
            capabilities.setCapability("platformVersion", "11");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("isRealMobile", true);
            capabilities.setCapability("app", "lt://APP1016033751687240613616465"); //Enter your app url
            capabilities.setCapability("deviceOrientation", "PORTRAIT");
            capabilities.setCapability("build", "Java Vanilla - Android");
            capabilities.setCapability("name", "Sample Test Java");
            capabilities.setCapability("console", true);
            capabilities.setCapability("network", false);
            capabilities.setCapability("visual", true);
            capabilities.setCapability("devicelog", true);

            driver = new AppiumDriver(new URL("https://" +userName + ":" + accessKey + "@mobile-hub.lambdatest.com/wd/hub"), capabilities);
            Thread.sleep(5000);
//            int screenWidth = driver.manage().window().getSize().getWidth();
//            int screenHeight = driver.manage().window().getSize().getHeight();
            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("LOG IN");
            el3.click();
            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.widget.EditText[1]");
            el2.click();
            el2.sendKeys("edijs@cunami.lv");
            driver.hideKeyboard();
            Thread.sleep(10000);
            //MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.widget.EditText[2]");
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ScrollView/android.widget.EditText[2]");
            el1.click();
            el1.sendKeys("Maskavas127!");
            Thread.sleep(10000);
            //cryptopass
//            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("REGISTER");
//            el3.click();

//            MobileElement element = (MobileElement) driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"Full name\"]"));
//            String textToFind = "signup.page.placeholder.fullnameField Value";
//            MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + textToFind + "\")"));
//            element.sendKeys("My email");


//            MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("LOG IN");
//            el3.click();
//            FlutterFinder finder = new FlutterFinder(driver);
//            FlutterElement el1 = finder.byValueKey("email_field");
//            el1.click();
//            el1.sendKeys("edijs@cunami.lv");
//            Thread.sleep(5000);
//            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[2]");
//            el2.click();
//            el2.sendKeys("Maskavas127");
//            Thread.sleep(5000);


        } catch (AssertionError a) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=failed");
            a.printStackTrace();
        }
// The driver.quit statement is required, otherwise the test continues to execute, leading to a timeout.
        driver.quit();
    }
    }
