package co.com.project.automation.prestaApp.util;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ClickCoordinates implements Interaction {

    AndroidDriver driver = getProxiedDriver();

    private int x;
    private int y;

    public ClickCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static ClickCoordinates go(int x, int y) {
        return Tasks.instrumented(ClickCoordinates.class, x, y);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x, y)).perform();
    }
}
