package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US06_StepDefs {
    UsersPage usersPage = new UsersPage();

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String name) {
        if (name.contains("Student")){
            Assert.assertEquals(name,usersPage.nameOfStudent.getText());
        }else {
            Assert.assertEquals(name, usersPage.nameOfLibrarian.getText());
        }
    }
}
