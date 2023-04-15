package co.com.project.automation.prestaApp.questions;

import co.com.project.automation.prestaApp.userinterfaces.HomeView;
import co.com.project.automation.prestaApp.userinterfaces.SimulationCredictView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SimulationCredictOK implements Question<Boolean> {


    public static SimulationCredictOK answer() {
        return new SimulationCredictOK();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(SimulationCredictView.QUESTIONS_VALUE_OF_PAYMENTS.resolveFor(actor).isVisible()){
            return true;
        }else {
            return false;
        }
    }
}
