package co.com.project.automation.prestaApp.tasks;

import co.com.project.automation.prestaApp.util.ClickCoordinates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.util.*;

import static co.com.project.automation.prestaApp.userinterfaces.CustomerView.*;
import static co.com.project.automation.prestaApp.userinterfaces.DashboardView.*;

public class RegisterCustomer implements Task {

    List<List<String>> data;

    public RegisterCustomer(List<List<String>> data) {
        this.data = data;
    }

    public static RegisterCustomer view(List<List<String>> data) {
        return Tasks.instrumented(RegisterCustomer.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_MENU_USER),
                ClickCoordinates.go(500,1800)
        );


        actor.attemptsTo(
                Click.on(COSTUMER_ID),
                SendKeys.of(data.get(1).get(0)).into(COSTUMER_ID),
                Click.on(NAME),
                SendKeys.of(data.get(1).get(1)).into(NAME),
                Click.on(LAST_NAME),
                SendKeys.of(data.get(1).get(2)).into(LAST_NAME),
                Click.on(BTN_SAVE_CUSTOMER)
        );
    }


}
