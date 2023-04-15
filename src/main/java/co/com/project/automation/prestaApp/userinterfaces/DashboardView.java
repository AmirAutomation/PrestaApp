package co.com.project.automation.prestaApp.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardView {

    public static Target BTN_MENU_USER =
            Target.the("Boton menu usuarios").located(AppiumBy.accessibilityId("Usuarios"));
    public static Target BTN_ADD_CUSTOMER =
            Target.the("Boton menu usuarios").located(By.xpath("//android.view.View[@content-desc=\"Add customer\"]/android.view.View/android.widget.ScrollView/android.view.View"));
    public static Target BTN_SIMULATION_CREDICT =
            Target.the("Boton simulacion de credito").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
}
