package starter.stepdefinitions.Projects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Login;

public class LoginStep {

    @Steps
    Login login;

    @Given("I set url and body")
    public void iSetUrlAndBody(){
        login.setUrlAndBody();
    }

    @When("I request login")
    public void iRequestLogin() {
        login.requestLogin();
    }

    @Then("I will get 524")
    public void iWillGet524() {
        login.validateStatusCode();
    }


}
