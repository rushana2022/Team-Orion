package com.libraryCT.step_definitions;

import com.libraryCT.pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class US07_AddingNewUsers {

    UsersPage users = new UsersPage();

    @When("I click on the Add Users")
    public void i_click_on_the_add_users() {

        users.addUserBtn.click();
    }

    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(Map<String,String> expectedMap) {


        Set<String> expectedSet = new LinkedHashSet<>(expectedMap.values());

        Set<String> actualSet = new LinkedHashSet<>();
        for (int i = 0; i < users.placeHolders.size()-1; i++) {
            actualSet.add(users.placeHolders.get(i).getAttribute("placeholder"));
        }
        if(users.textarea.getText().isEmpty()){
            actualSet.add("null");
        }

        Assert.assertEquals(actualSet,expectedSet);
    }
}
