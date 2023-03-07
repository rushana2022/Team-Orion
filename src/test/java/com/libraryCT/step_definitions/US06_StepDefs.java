package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_StepDefs {
    LoginPage_RB loginPage = new LoginPage_RB();

    @Given("librarian is on the login page of the library application")
    public void librarian_is_on_the_login_page_of_the_library_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }

    @When("librarian enters valid email {string} and password {string}")
    public void librarian_enters_valid_email_address_and_password(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("librarian clicks to Sign in button")
    public void librarian_clicks_to_sign_in_button() {
        loginPage.signInBtn.click();
        BrowserUtils.sleep(2);
    }

    @Then("account holder name should be name {string}")
    public void account_holder_name_should_be_name(String name) {
        String actualName = loginPage.accountHolderName.getText();
        Assert.assertEquals(name, actualName);
    }
}
