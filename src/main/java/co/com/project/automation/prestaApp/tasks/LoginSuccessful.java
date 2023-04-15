package co.com.project.automation.prestaApp.tasks;

import static co.com.project.automation.prestaApp.userinterfaces.LoginView.*;

import co.com.project.automation.prestaApp.interaction.Hide;

import co.com.project.automation.prestaApp.models.DataLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;


public class LoginSuccessful implements Task {

    private List<List<String>> data;

    public LoginSuccessful(List<List<String>> data) {
        this.data = data;
    }
    public static LoginSuccessful view(List<List<String>> data) {
        return Tasks.instrumented(LoginSuccessful.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EMAIL),
                SendKeys.of(data.get(1).get(0)).into(EMAIL),
                Click.on(PASSWORD),
                SendKeys.of(data.get(1).get(1)).into(PASSWORD),
                Hide.view()
                );

        actor.attemptsTo(

                Click.on(BTN_LOGIN)
        );


    }
}
