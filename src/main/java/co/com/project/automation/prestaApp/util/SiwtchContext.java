package co.com.project.automation.prestaApp.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

public class SiwtchContext {
    public SiwtchContext() {
    }

    AndroidDriver driver;
    DesiredCapabilities caps = new DesiredCapabilities();

    public void switchToWebView() {

        Set<String> contexts = driver.getContextHandles();
        for(String context: contexts){
            System.out.println(context);
            if(context.contains("WEBVIEW_com.yibsonalexis.prestapp")){
                driver.context(context);
                break;
            }
        }

        caps.setCapability("platformName", "Android");
        caps.setCapability("appium.autoWebview", true);
        caps.setCapability("chromedriverExecutable", "C:\\Appium\\co.com.project.automation.prestaApp\\src\\test\\resources\\driver\\chromedriver.exe");

        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
