package co.com.project.automation.prestaApp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import java.util.List;

import static co.com.project.automation.prestaApp.userinterfaces.DashboardView.*;
import static co.com.project.automation.prestaApp.userinterfaces.SimulationCredictView.*;

public class SimulationCredict implements Task {

    List<List<String>> data;

    public SimulationCredict(List<List<String>> data) {
        this.data = data;
    }

    public static SimulationCredict view(List<List<String>> data) {
        return Tasks.instrumented(SimulationCredict.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIMULATION_CREDICT)
        );

        actor.attemptsTo(
                Click.on(VALUE),
                SendKeys.of(data.get(1).get(0)).into(VALUE),
                Click.on(INTEREST),
                SendKeys.of(data.get(1).get(1)).into(INTEREST),
                Click.on(NUMBER_PAYMENTS),
                SendKeys.of(data.get(1).get(2)).into(NUMBER_PAYMENTS),
                Click.on(BUTTON_PAYMENTS),
                Click.on(OPTION_INTEREST_PAYMENTS),
                Click.on(BUTTON_LOAN_DATE),
                Click.on(EDIT_DATE),
                Clear.field(DATE),
                SendKeys.of(data.get(1).get(3)).into(DATE),
                Click.on(BUTTON_OK),
                Click.on(LINK_SEE_SIMULATION)
                );

    }
}
