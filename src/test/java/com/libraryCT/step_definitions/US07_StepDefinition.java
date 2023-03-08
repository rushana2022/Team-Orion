package com.libraryCT.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US07_StepDefinition {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        System.out.println("hhh");
    }
    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(io.cucumber.datatable.DataTable dataTable) {

    }

    @Given("I click on {string} module")
    public void i_click_on_module(String string) {

    }
    @When("I click on the Add Users")
    public void i_click_on_the_add_users() {

    }
    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(io.cucumber.datatable.DataTable dataTable) {

    }
}
