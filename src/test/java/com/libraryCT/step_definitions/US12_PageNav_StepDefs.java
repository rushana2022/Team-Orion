package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class US12_PageNav_StepDefs {

    LoginPage_RB loginPage_rb = new LoginPage_RB();

    UsersPage usersPage = new UsersPage();


    @When("I click on {string} link")
    public void iClickOnLink(String link) {
        usersPage.navigateTo(link);
    }

    @And("I login as a librarian")
    public void iLoginAsALibrarian() {
        loginPage_rb.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }
}
