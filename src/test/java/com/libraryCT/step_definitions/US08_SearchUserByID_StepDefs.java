package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UsersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class US08_SearchUserByID_StepDefs {

    LoginPage_RB loginPageRb = new LoginPage_RB();

    UsersPage usersPage = new UsersPage();


    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(Map<String,String> loginCredentials) {
        loginPageRb.login(loginCredentials.get("email"),loginCredentials.get("password"));

    }

    @Then("table should contain this data")
    public void table_should_contain_this_data(Map<String,Object> expectedData) {

        Map<String, Object> expectedMap = new TreeMap<>(expectedData);
        Map<String, Object> actualMap = new TreeMap<>();

        for (int i = 1; i < usersPage.keysMap.size()-2; i++) {
            actualMap.put(usersPage.keysMap.get(i).getText(), usersPage.valuesMap.get(i).getText());
        }

        Assert.assertEquals(expectedMap,actualMap);

    }
}
