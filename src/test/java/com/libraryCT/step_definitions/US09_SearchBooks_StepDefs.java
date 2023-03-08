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
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class US09_SearchBooks_StepDefs {

    LoginPage_RB loginPage = new LoginPage_RB();
    UsersPage usersPage =new UsersPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("I login to application as a student")
    public void i_login_to_application_as_a_student() {
        loginPage.login();
    }
    @When("I navigate to {string} page")
    public void i_navigate_to_page(String page) {
        usersPage.navigateTo(page);
    }
    @When("I search for {string}")
    public void i_search_for(String bookName) {
        usersPage.searchBox.sendKeys(bookName);
        BrowserUtils.sleep(1);
    }
    @Then("books table should contain results matching The Goldfinch")
    public void books_table_should_contain_results_matching_the_goldfinch(Map<String, Object> bookInfo) {

        Map<String, Object> expectedMap = new TreeMap<>(bookInfo);
        Map<String, Object> actualMap = new TreeMap<>();

        List<String> keys = new ArrayList<>();
        for (WebElement eachKey : usersPage.keysMap) {
            keys.add(eachKey.getText());
        }

        List<String> values = new ArrayList<>();
        for (WebElement eachValue : usersPage.valuesMap) {
            values.add(eachValue.getText());
        }

        for (int i = 1; i < keys.size()-1; i++) {
            actualMap.put(keys.get(i), values.get(i));
        }

        Assert.assertEquals(expectedMap,actualMap);
    }
}
