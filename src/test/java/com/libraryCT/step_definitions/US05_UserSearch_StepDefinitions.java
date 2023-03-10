package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.SearchPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class US05_UserSearch_StepDefinitions {

    SearchPage searchPage = new SearchPage();


    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with_tests(String test) {
        List<String> allEmails = BrowserUtils.getElementsText(searchPage.allEmails);
        for (String allEmail : allEmails) {
            Assert.assertTrue(allEmail.contains(test));
        }
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> dataTable) {

        List<String> dataInfo = BrowserUtils.getElementsText(searchPage.columns);
        Assert.assertTrue(dataInfo.containsAll(dataTable));

    }
}

