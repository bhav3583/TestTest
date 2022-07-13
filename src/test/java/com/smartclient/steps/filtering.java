package com.smartclient.steps;

import com.smartclient.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class filtering {


    @Given("^I click on tile and filtering$")
    public void iClickOnTileAndFiltering() {
        new HomePage().clickOnIAgreeButton();
        new HomePage().clickOnTileSortAndFiltering();
    }

    @When("^I set animal using letter \"([^\"]*)\"$")
    public void iSetAnimalUsingLetter(String text) throws InterruptedException {
        new HomePage().enterAInAnimalField(text);
    }

    @And("^I set life span to (\\d+)$")
    public void iSetLifeSpanTo(int arg0) throws InterruptedException {
        new HomePage().dragSlider();
    }

    @And("^I select \"([^\"]*)\" from dropdown$")
    public void iSelectFromDropdown(String text) throws InterruptedException {
        new HomePage().selectFromDropDown(text);
    }

    @And("^I select checkbox to ascending$")
    public void iSelectCheckboxToAscending() {
        new HomePage().clickOnCheckBox();
    }

    @Then("^I verify result contain more than (\\d+) items$")
    public void iVerifyResultContainMoreThanItems(int arg0) {
        new HomePage().verifyResult();
    }


    @Given("^I click on dropdown grid$")
    public void iClickOnDropdownGrid() {
        new HomePage().clickOnIAgreeButton();
        new HomePage().clickOnDropDownGrid();
    }

    @And("^when I select excercise from the dropdown$")
    public void whenISelectExcerciseFromTheDropdown() {
        new HomePage().clickOnGridDropDownField();
    }

    @Then("^I able to select Excercise$")
    public void iAbleToSelectExcercise() throws InterruptedException {
        new HomePage().clickOnItemDropDown();
    }


}
