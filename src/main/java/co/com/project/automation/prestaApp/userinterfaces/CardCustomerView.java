package co.com.project.automation.prestaApp.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CardCustomerView {

    public static Target BTN_INFO =
            Target.the("Botton Info").located(AppiumBy.accessibilityId("Info"));

    public static Target BTN_UPDATE =
            Target.the("Botton update").located(AppiumBy.accessibilityId("Update"));

    public static Target BTN_DELETE =
            Target.the("Botton delete").located(AppiumBy.accessibilityId("Delete"));

    public static Target Q_UPDATE_CUSTOMER =
            Target.the("Question update").located(AppiumBy.accessibilityId("Nice \uD83D\uDC4D\uD83C\uDFFC\n" +
                    "Customer successfully saved"));

    public static Target Q_DELETE_CUSTOMER =
            Target.the("Botton delete").located(AppiumBy.accessibilityId("Nice \uD83D\uDC4D\uD83C\uDFFC\n" +
                    "Customer successfully deleted"));
}
