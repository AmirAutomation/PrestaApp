package co.com.project.automation.prestaApp.questions;

import co.com.project.automation.prestaApp.tasks.RegisterCustomer;
import co.com.project.automation.prestaApp.userinterfaces.CustomerView;
import co.com.project.automation.prestaApp.userinterfaces.HomeView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegisterCustomerOK implements Question<Boolean> {

    public static RegisterCustomerOK answer() {
        return new RegisterCustomerOK();
    }
    @Override
    public Boolean answeredBy(Actor actor) {

        if(CustomerView.MSG_REGISTER_SUCCESSFUL_CUSTOMER.resolveFor(actor).isVisible()){
            return true;
        }else {
            return false;
        }
    }
}
