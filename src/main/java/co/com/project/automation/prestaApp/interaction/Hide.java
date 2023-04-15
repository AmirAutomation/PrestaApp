package co.com.project.automation.prestaApp.interaction;

import co.com.project.automation.prestaApp.tasks.LoginSuccessful;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.SerenitySystemProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import static co.com.project.automation.prestaApp.userinterfaces.HomeView.HOME_DASHBOARD;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Hide implements Interaction {

    AndroidDriver driver = getProxiedDriver();


    public static Hide view() {
        return Tasks.instrumented(Hide.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.hideKeyboard();

    }

}
