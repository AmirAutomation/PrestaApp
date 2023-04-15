package co.com.project.automation.prestaApp.tasks;

import co.com.project.automation.prestaApp.interaction.Hide;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;

import static co.com.project.automation.prestaApp.userinterfaces.LoginView.*;

public class LoginFailed implements Task {


    private List<List<String>> data;

    public LoginFailed(List<List<String>> data) {
        this.data = data;
    }


    public static LoginFailed view(List<List<String>> data) {
        return Tasks.instrumented(LoginFailed.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(EMAIL),
            SendKeys.of(data.get(1).get(0)).into(EMAIL),
            Click.on(PASSWORD),
            SendKeys.of(data.get(1).get(1)).into(PASSWORD),
            Hide.view(),
            Click.on(BTN_LOGIN));
    }
}
