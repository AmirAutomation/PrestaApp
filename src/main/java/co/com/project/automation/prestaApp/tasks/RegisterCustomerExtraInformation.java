package co.com.project.automation.prestaApp.tasks;

import co.com.project.automation.prestaApp.util.ClickCoordinates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;

import static co.com.project.automation.prestaApp.userinterfaces.CustomerView.*;
import static co.com.project.automation.prestaApp.userinterfaces.DashboardView.BTN_MENU_USER;

public class RegisterCustomerExtraInformation implements Task {

    private List<List<String>> data;

    public RegisterCustomerExtraInformation(List<List<String>> data) {
        this.data = data;
    }

    public static RegisterCustomerExtraInformation view(List<List<String>> data) {
        return Tasks.instrumented(RegisterCustomerExtraInformation.class, data);
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
                Click.on(LINK_EXTRA_INFORMATION)

        );

        actor.attemptsTo(
                Click.on(ADDRESS),
                SendKeys.of(data.get(1).get(3)).into(ADDRESS),
                Click.on(EMAIL),
                SendKeys.of(data.get(1).get(4)).into(EMAIL),
                Click.on(CELLPHONE),
                SendKeys.of(data.get(1).get(5)).into(CELLPHONE),
                Click.on(LANDLINE),
                SendKeys.of(data.get(1).get(6)).into(LANDLINE),
                Click.on(BTN_SAVE_CUSTOMER)
        );
    }
}
