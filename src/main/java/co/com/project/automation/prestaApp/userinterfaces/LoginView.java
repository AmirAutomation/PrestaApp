package co.com.project.automation.prestaApp.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target LOGIN_HOME = Target.the("Home").located(AppiumBy.accessibilityId("Login with:"));
    public static Target EMAIL = Target.the("Email").located(By.xpath("//android.widget.EditText[1]"));
    public static Target PASSWORD = Target.the("Password").located(By.xpath("//android.widget.EditText[2]"));
    public static Target BTN_LOGIN = Target.the("Btn login").located(AppiumBy.accessibilityId("Login"));
    public static Target MSG_LOGIN_FAILED = Target.the("Question").located(By.xpath("//android.view.View[@content-desc=\"Opps! \uD83E\uDD15\n" +
            "The email or password is incorrect\"]"));


}
