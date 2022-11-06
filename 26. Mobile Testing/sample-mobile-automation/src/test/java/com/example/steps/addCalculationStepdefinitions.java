package com.example.steps;

import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addCalculationStepdefinitions {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("I am on the calculator page")
    public void iAmOnTheCalculatorPage() {
        calculatorPage.calculatorHeaderDisplayed();
    }

    @And("I input number")
    public void iInputNumber() {
        calculatorPage.inputNumber();
    }

    @And("a is {int}")
    public void aIs(int arg0) {
        calculatorPage.a();
    }

    @And("b is {int}")
    public void bIs(int arg0) {
        calculatorPage.b();
    }

    @When("I add a and b")
    public void iAddAAndB() {
        calculatorPage.add();
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int arg0) {
        calculatorPage.total();
    }
}
