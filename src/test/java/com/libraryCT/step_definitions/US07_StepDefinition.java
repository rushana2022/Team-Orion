package com.libraryCT.step_definitions;

import com.libraryCT.pages.myUserStoryLogin;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class US07_StepDefinition {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }

    myUserStoryLogin myUserStoryLogin = new myUserStoryLogin();
    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(Map<String, String> credentials) {
        myUserStoryLogin.login(credentials.get("email"),credentials.get("password"));
    }
    @Given("I click on {string} module")
    public void i_click_on_module(String module) {

        myUserStoryLogin.userModule.click();
    }
    @When("I click on the Add Users")
    public void i_click_on_the_add_users() {

        myUserStoryLogin.addUserBtn.click();
    }
    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(io.cucumber.datatable.DataTable dataTable) {


    }
}
