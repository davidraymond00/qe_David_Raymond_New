package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Cart;

public class CartStep {

    @Steps
    Cart cart;
    @Given("I sett valid url")
    public void iSettValidUrl() {
        cart.setValidUrl();
    }

    @When("I request get all my cart")
    public void iRequestGetAllMyCart() {
        cart.requestGetAllMyCart();
    }

    @Then("I will get 200 ok")
    public void iWillGet200Ok() {
        cart.statusCode200();
    }

    @And("Get list of all my cart with id")
    public void getListOfAllMyCartWithId() {
        cart.getCartWithId();
    }

    @And("Get list of all my cart with date")
    public void getListOfAllMyCartWithDate() {
        cart.getCartWithDate();
    }


}
