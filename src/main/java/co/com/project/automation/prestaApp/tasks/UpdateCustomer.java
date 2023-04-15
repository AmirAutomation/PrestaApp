package co.com.project.automation.prestaApp.tasks;

import co.com.project.automation.prestaApp.userinterfaces.CustomerView;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;

import static co.com.project.automation.prestaApp.userinterfaces.CardCustomerView.BTN_UPDATE;
import static co.com.project.automation.prestaApp.userinterfaces.CustomerView.*;
import static co.com.project.automation.prestaApp.userinterfaces.DashboardView.BTN_MENU_USER;

public class UpdateCustomer implements Task {

    List<List<String>> data;

    public UpdateCustomer(List<List<String>> data) {
        this.data = data;
    }

    public static UpdateCustomer view(List<List<String>> data) {
        return Tasks.instrumented(UpdateCustomer.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_MENU_USER),
                Click.on(BTN_SEARCH),
                Click.on(TXT_SEARCH_CUSTOMER),
                SendKeys.of(data.get(1).get(1)).into(TXT_SEARCH_CUSTOMER),
                Click.on(CustomerView.customerEdit(data.get(1).get(1),data.get(1).get(2),data.get(1).get(0))),
                Click.on(BTN_UPDATE),
                Click.on(NAME),
                Clear.field(NAME),
                SendKeys.of(data.get(1).get(3)).into(NAME),
                Click.on(BTN_EDIT_CUSTOMER)
        );

    }
}
