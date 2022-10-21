package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.Product;

public class ProductStep {

    @Steps
    Product product;
    @Given("I set valid url")
    public void iSetValidUrl() {
        product.setValidUrl();
    }

    @When("I request get all product")
    public void iRequestGetAllProduct() {
        product.requestGetAllProduct();
    }

    @Then("I will get 200")
    public void iWillGet200() {
        product.validateStatus200();
    }

    @And("Get list of all my product with category")
    public void getListOfAllMyProductWithCategory() {
        product.getListWithCategory();
    }

    @And("Get list of all my product with id")
    public void getListOfAllMyProductWithId() {
        product.getListWithId();
    }

    @And("Get list of all my product with price")
    public void getListOfAllMyProductWithPrice() {
        product.getListWithPrice();
    }

    @And("Get list of all my product with description")
    public void getListOfAllMyProductWithDescription() {
        product.getListWithDescription();
    }
}
