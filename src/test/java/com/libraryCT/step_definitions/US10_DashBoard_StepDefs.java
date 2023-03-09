package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_DashBoard_StepDefs {

    LoginPage_RB loginPage = new LoginPage_RB();
    UsersPage usersPage = new UsersPage();

    @When("I enter username {string}")
    public void i_enter_username(String email10) {
        loginPage.emailInput.sendKeys(email10);
    }
    @When("I enter password {string}")
    public void i_enter_password(String password10) {
        loginPage.passwordInput.sendKeys(password10);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.signInBtn.click();
    }
    @Then("{string} should be displayed")
    public void dashboard_should_be_displayed(String expectedTitle) {
        Assert.assertTrue(usersPage.dashboardTitle.getText().contains(expectedTitle));
    }
}
