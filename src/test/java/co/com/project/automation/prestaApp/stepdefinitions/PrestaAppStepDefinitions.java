package co.com.project.automation.prestaApp.stepdefinitions;

import co.com.project.automation.prestaApp.questions.*;
import co.com.project.automation.prestaApp.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.xml.crypto.Data;
import java.util.List;


public class PrestaAppStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that roboot open app PrestaApp go Login")
    public void thatRobootOpenAppPrestaAppGoLogin() {
        OnStage.theActorCalled("Robot").wasAbleTo(LoginHome.view());
    }

    @When("The user login correctly")
    public void theUserLoginCorrectly(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorInTheSpotlight().attemptsTo(LoginSuccessful.view(data));
    }
    @Then("Validate the login successful in PrestApp")
    public void validateTheLoginSuccessfulInPrestApp() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginSuccessfulOK.answer()));
    }

    @When("The user login faild")
    public void theUserLoginFaild(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorInTheSpotlight().attemptsTo(LoginFailed.view(data));

    }
    @Then("Validate the login faild in PrestApp")
    public void validateTheLoginFaildInPrestApp() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginFailedOK.answer()));

    }

    @Given("that roboot open app PrestaApp")
    public void thatRobootOpenAppPrestaApp(DataTable usercredentials) {
        List<List<String>> data = usercredentials.cells();
        OnStage.theActorCalled("Robot").wasAbleTo(LoginHome.view(), LoginSuccessful.view(data));
    }
    @When("The user register customer")
    public void theUserRegisterCustomer(DataTable dataCustomer) {

        List<List<String>> data = dataCustomer.cells();
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterCustomer.view(data));
    }

    @When("The user register customer extra information")
    public void theUserRegisterCustomerExtraInformation(DataTable dataCustomerExtra) {

        List<List<String>> data = dataCustomerExtra.cells();


        OnStage.theActorInTheSpotlight().attemptsTo(RegisterCustomerExtraInformation.view(data));

    }

    @Then("Validate customer registered")
    public void validateCustomerRegistered() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegisterCustomerOK.answer()));

    }

    @When("The user run a simulation")
    public void theUserRunASimulation(DataTable dataSimulateCredit) {

        List<List<String>> data = dataSimulateCredit.cells();

        OnStage.theActorInTheSpotlight().attemptsTo(SimulationCredict.view(data));

    }
    @Then("Validate the credit simulation")
    public void validateTheCreditSimulation() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SimulationCredictOK.answer()));
    }


    @When("The user edit information the customer")
    public void theUserEditInformationTheCustomer(DataTable dataCustomerUpdate) {

        List<List<String>> data = dataCustomerUpdate.cells();

        OnStage.theActorInTheSpotlight().attemptsTo(UpdateCustomer.view(data));
    }
    @Then("Validate customer update")
    public void validateCustomerUpdate() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UpdateCustomerOK.answer()));
    }

    @When("The user delete information the customer")
    public void theUserDeleteInformationTheCustomer(DataTable dataCustomerDelete) {

        List<List<String>> data = dataCustomerDelete.cells();

        OnStage.theActorInTheSpotlight().attemptsTo(DeleteCustomer.view(data));
    }
    @Then("Validate customer delete")
    public void validateCustomerDelete() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(DeleteCustomerOK.answer()));

    }
}
