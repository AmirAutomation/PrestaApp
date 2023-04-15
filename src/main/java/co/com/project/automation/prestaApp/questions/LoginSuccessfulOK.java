package co.com.project.automation.prestaApp.questions;

import co.com.project.automation.prestaApp.userinterfaces.HomeView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginSuccessfulOK implements Question<Boolean> {


    public static LoginSuccessfulOK answer() {
        return new LoginSuccessfulOK();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        if(HomeView.HOME_DASHBOARD.resolveFor(actor).isVisible()){
            return true;
        }else {
            return false;
        }
    }
}
