package co.com.project.automation.prestaApp.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {


    public static Target HOME_DASHBOARD = Target.the("Home Dashboard").located(By.xpath("(//android.view.View[@content-desc=\"Dashboard\"])[1]"));

}
