package co.com.project.automation.prestaApp.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CustomerView {

    public static Target COSTUMER_ID =
            Target.the("Campo ID").located(By.xpath("//android.widget.EditText[1]"));
    public static Target NAME =
            Target.the("Campo name").located(By.xpath("//android.widget.EditText[2]"));
    public static Target LAST_NAME =
            Target.the("Campo Last Name").located(By.xpath("//android.widget.EditText[3]"));
    public static Target BTN_SAVE_CUSTOMER =
            Target.the("Btn save").located(AppiumBy.accessibilityId("SAVE CUSTOMER"));

    public static Target BTN_EDIT_CUSTOMER =
            Target.the("Btn edit").located(AppiumBy.accessibilityId("EDIT CUSTOMER"));

    public static Target LINK_EXTRA_INFORMATION =
            Target.the("Campo Last Name").located(AppiumBy.accessibilityId("Extra information"));

    public static Target customerEdit(String name,String lastname, String document){
        return Target.the("Card customer").located(AppiumBy.accessibilityId(""+name+" "+lastname+ "\n" +
                ""+document+""));
    }

    public static Target ADDRESS =
            Target.the("Campo address").located(By.xpath("//android.widget.EditText[4]"));

    public static Target EMAIL =
            Target.the("Campo email").located(By.xpath("//android.widget.EditText[5]"));

    public static Target CELLPHONE =
            Target.the("Campo cellphone").located(By.xpath("//android.widget.EditText[6]"));

    public static Target LANDLINE =
            Target.the("Campo Landline").located(By.xpath("//android.widget.EditText[7]"));

    public static Target MSG_REGISTER_SUCCESSFUL_CUSTOMER =
            Target.the("Campo Last Name").located(AppiumBy.accessibilityId("Nice \uD83D\uDC4D\uD83C\uDFFC\n" +
                    "Customer successfully saved"));

    public static Target BTN_SEARCH =
            Target.the("Campo Last Name").located(By.xpath("//android.view.View[@content-desc=\"Customers\"]/android.widget.Button[1]"));

    public static Target TXT_SEARCH_CUSTOMER =
            Target.the("Campo Last Name").located(By.xpath("//android.view.View[@content-desc=\"Add customer\"]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));




}
