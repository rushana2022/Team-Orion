package com.libraryCT.step_definitions;

import com.libraryCT.pages.UsersPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_ShowAnyRec_StepDefs {

    UsersPage usersPage = new UsersPage();

    @When("I select Show {int} records")
    public void i_select_show_records(int int1) {
       usersPage.clickAny(int1);
    }
    @Then("show records value should be {int}")
    public void show_records_value_should_be(int int2) {
        int num = Integer.parseInt(usersPage.value(int2));
        Assert.assertEquals(int2,num);
    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(int int3) {
        if (int3 == 500 || int3 == 200){
            BrowserUtils.waitFor(5);
        }
        Assert.assertEquals(int3, usersPage.records());
    }
}
