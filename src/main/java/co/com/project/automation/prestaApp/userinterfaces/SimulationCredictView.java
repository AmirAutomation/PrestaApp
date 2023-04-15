package co.com.project.automation.prestaApp.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulationCredictView {

    public static Target VALUE =
            Target.the("Value").located(By.xpath("//android.widget.EditText[1]"));
    public static Target INTEREST =
            Target.the("Interest").located(By.xpath("//android.widget.EditText[2]"));
    public static Target NUMBER_PAYMENTS =
            Target.the("Payments").located(By.xpath("//android.widget.EditText[3]"));
    public static Target BUTTON_PAYMENTS =
            Target.the("btn Payments").located(AppiumBy.accessibilityId("Payment*\n" +
                    "Diary"));
    public static Target OPTION_INTEREST_PAYMENTS =
            Target.the("Option interest Payments").located(AppiumBy.accessibilityId("Monthly"));
    public static Target BUTTON_LOAN_DATE =
            Target.the("Btn loan date").located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
    public static Target EDIT_DATE =
            Target.the("Edit date").located(By.xpath("//android.widget.Button[@class=\"android.widget.Button\"]/android.widget.Button[1]"));
    public static Target DATE =
            Target.the("Date").located(By.xpath("//android.widget.EditText[1]"));
    public static Target BUTTON_OK =
            Target.the("btn OK").located(AppiumBy.accessibilityId("OK"));
    public static Target LINK_SEE_SIMULATION =
            Target.the("Link simulation").located(AppiumBy.accessibilityId("See simulation"));

    public static Target QUESTIONS_VALUE_OF_PAYMENTS =
            Target.the("Link simulation").located(By.xpath("//android.widget.ImageView[@class=\"android.widget.ImageView\"]"));


    //android.view.View[@content-desc="Add customer"]/android.view.View/android.widget.ScrollView/android.view.View/android.view.View


}
