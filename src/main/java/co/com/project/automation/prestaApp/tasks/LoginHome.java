package co.com.project.automation.prestaApp.tasks;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static co.com.project.automation.prestaApp.userinterfaces.LoginView.BTN_LOGIN;

public class LoginHome implements Task {

    AndroidDriver driver;

    public static LoginHome view() {
        return Tasks.instrumented(LoginHome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //MoveMouse.to(LG).andThen(actions -> actions.moveByOffset(520,1559)).andThen(actions -> actions.click())
        );
    }
}
