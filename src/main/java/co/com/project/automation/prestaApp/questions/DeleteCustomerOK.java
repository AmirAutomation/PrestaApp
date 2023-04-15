package co.com.project.automation.prestaApp.questions;

import co.com.project.automation.prestaApp.userinterfaces.CardCustomerView;
import co.com.project.automation.prestaApp.userinterfaces.LoginView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DeleteCustomerOK implements Question<Boolean> {


    public static DeleteCustomerOK answer() {
        return new DeleteCustomerOK();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(CardCustomerView.Q_DELETE_CUSTOMER.resolveFor(actor).isVisible()){
            return true;
        }else {
            return false;
        }
    }
}
