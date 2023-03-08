package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibrarianUserPageML;
import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.Parse;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class US03_StepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));

    }
    @Given("I login to the application as a librarian")
    public void i_login_to_the_application_as_a_librarian() {
        LoginPage_RB loginPage_rb = new LoginPage_RB();
        loginPage_rb.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
        loginPage_rb.signInBtn.click();
    }

    LibrarianUserPageML librarianUserPageML = new LibrarianUserPageML();
    @When("I navigate to the Users page")
    public void i_navigate_to_the_users_page() {
        librarianUserPageML.usersModuleButton.click();
    }


    @And("I set the dropdown to {string}")
    public void iSetTheDropdownTo(String arg0) {
        Select rowNumberDropdown = new Select(Driver.getDriver().findElement(By.name("tbl_users_length")));
        int index = Integer.parseInt(arg0);
        rowNumberDropdown.selectByIndex(index);
    }

    @Then("the actual {string} displayed on the page should match the number at index")
    public void theActualDisplayedOnThePageShouldMatchTheNumberAtIndex(String arg0) {
        BrowserUtils.sleep(3);
        WebElement userTable = Driver.getDriver().findElement(By.xpath("//table[@aria-describedby='tbl_users_info']/tbody"));
        List<WebElement> rows =  Driver.getDriver().findElements(By.tagName("tr"));
        int count = rows.size()-1;
        int arg1 = Integer.parseInt(arg0);
        Assert.assertEquals(arg1,count);
    }
}
