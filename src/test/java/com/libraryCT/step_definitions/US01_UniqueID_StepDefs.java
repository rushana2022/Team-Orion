package com.libraryCT.step_definitions;



import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class US01_UniqueID_StepDefs {

 UsersPage usersPage = new UsersPage();

    LoginPage_RB loginPage_rb = new LoginPage_RB();
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
       loginPage_rb.login();
    }



    @When("I click on {string} link")
    public void i_click_on_link(String expectedStr) {

      usersPage.navigateTo(expectedStr);

    }


    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {
        List<String> expected = new ArrayList<>(); // accepts duplicates

        for (WebElement idNumber : usersPage.idNumbers) {
            expected.add(idNumber.getText());
        }

        Set<String> actual = new HashSet<>(); // no duplicates

        for (WebElement idNumber : usersPage.idNumbers) {
            actual.add(idNumber.getText());
        }

        Assert.assertEquals(actual.size(),expected.size());
    }
}
