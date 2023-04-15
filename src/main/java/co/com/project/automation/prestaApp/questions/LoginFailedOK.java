package co.com.project.automation.prestaApp.questions;

import co.com.project.automation.prestaApp.userinterfaces.HomeView;
import co.com.project.automation.prestaApp.userinterfaces.LoginView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginFailedOK implements Question<Boolean> {
    public static LoginFailedOK answer() {
        return new LoginFailedOK();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(LoginView.MSG_LOGIN_FAILED.resolveFor(actor).isVisible()){
            return true;
        }else {
            return false;
        }
    }
}
