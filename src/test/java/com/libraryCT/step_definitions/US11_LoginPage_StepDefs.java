package com.libraryCT.step_definitions;


import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_LoginPage_StepDefs {

    LoginPage_RB login = new LoginPage_RB();

    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String password) {
        login.login(email,password);
    }

    UsersPage usersPage = new UsersPage();

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String module) {
        usersPage.isPageDisplayed(module);
    }

}
