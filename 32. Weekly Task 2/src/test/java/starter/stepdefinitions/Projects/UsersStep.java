package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Users;

public class UsersStep {

    @Steps
    Users users;
    @Given("I set validd url")
    public void iSetValiddUrl(){
        users.setValidUrl();
    }

    @When("I request get all users")
    public void iRequestGetAllUsers() {
        users.requestGetAllUser();
    }

    @Then("I will get message 200")
    public void iWillGetMessage200() {
        users.statusCode200();
    }

    @And("Get list of all my users with id")
    public void getListOfAllMyUsersWithId() {
        users.getUserWithId();
    }

    @And("Get list of all my users with email")
    public void getListOfAllMyUsersWithEmail() {
        users.getUserWithEmail();
    }

    @And("Get list of all my users with username")
    public void getListOfAllMyUsersWithUsername() {
        users.getUserWithUsername();
    }

    @And("Get list of all my users with phone")
    public void getListOfAllMyUsersWithPhone() {
        users.getUserWithPhone();
    }

    @And("Get list of all my users with password")
    public void getListOfAllMyUsersWithPassword() {
        users.getUserWithPassword();
    }

    @And("Get list of all my users with city")
    public void getListOfAllMyUsersWithCity() {
        users.getUserWithCity();
    }

    @And("Get list of all my users with street")
    public void getListOfAllMyUsersWithStreet() {
        users.getUserWithStreet();
    }

    @And("Get list of all my users with lastname")
    public void getListOfAllMyUsersWithLastname() {
        users.getUserWithLastname();
    }

    @And("Get list of all my users with firstname")
    public void getListOfAllMyUsersWithFirstname() {
        users.getUserWithFirstname();
    }
}
