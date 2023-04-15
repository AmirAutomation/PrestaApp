package co.com.project.automation.prestaApp.questions;

import co.com.project.automation.prestaApp.userinterfaces.CardCustomerView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UpdateCustomerOK implements Question<Boolean> {

    public static UpdateCustomerOK answer() {
        return new UpdateCustomerOK();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(CardCustomerView.Q_UPDATE_CUSTOMER.resolveFor(actor).isVisible()){
            return true;
        }else {
            return false;
        }
    }
}
