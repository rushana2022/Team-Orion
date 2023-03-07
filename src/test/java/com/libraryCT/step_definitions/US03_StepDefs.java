package com.libraryCT.step_definitions;

import com.libraryCT.pages.LibrarianUserPageML;
import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US03_StepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));

    }
    @Given("I login to the application as a librarian")
    public void i_login_to_the_application_as_a_librarian() {
        LoginPage_RB loginPage_rb = new LoginPage_RB();
        loginPage_rb.login(ConfigurationReader.getProperty("librarian_username"), ConfigurationReader.getProperty("librarian_password"));
    }

    LibrarianUserPageML librarianUserPageML = new LibrarianUserPageML();
    @When("I navigate to the Users page")
    public void i_navigate_to_the_users_page() {
        librarianUserPageML.usersModuleButton.click();
    }
    @When("I set the dropdown to {string} students")
    public void i_set_the_dropdown_to_students(int index) {
        Select rowNumberDropdown = new Select(Driver.getDriver().findElement(By.name("tbl_users_length")));
        rowNumberDropdown.selectByIndex(index);

    }
    @Then("the page should contain {string} student rows")
    public void the_page_should_contain_student_rows(String string) {
        List<WebElement> rows =  Driver.getDriver().findElements(By.xpath("//table[@aria-describedby='tbl_users_info']"));
        int count = rows.size();
        Assert.assertTrue(string.equals(count));
    }

}
