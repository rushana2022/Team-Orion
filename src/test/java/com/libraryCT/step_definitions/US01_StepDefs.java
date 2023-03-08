package com.libraryCT.step_definitions;

import com.libraryCT.pages.HomePage_LC;
import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US01_StepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get("https://library2.cydeo.com/login.html");


    }

    LoginPage_RB loginPage = new LoginPage_RB();
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.signInBtn.click();

    }

    HomePage_LC homePage = new HomePage_LC();

    @When("I click on Users link")
    public void i_click_on_link() {
        homePage.UsersModule.click();


    }

    UsersPage usersPage = new UsersPage();
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {
        for (int i = 0; i < usersPage.usersIdList.size()-1; i++) {

            Assert.assertNotEquals(usersPage.usersIdList.get(i).getText(),usersPage.usersIdList.get(i+1).getText());

        }






    }


}
