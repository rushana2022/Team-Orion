package com.libraryCT.step_definitions;

import com.libraryCT.pages.HomePage;
import com.libraryCT.pages.LoginPage_RB;
import com.libraryCT.pages.UserPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US02_StepDefs {


    LoginPage_RB loginPage_rb = new LoginPage_RB();
    HomePage homePage = new HomePage();

    UserPage userpage = new UserPage();

    
    @And("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage_rb.emailInput.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage_rb.passwordInput.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage_rb.signInBtn.click();

    }
    @When("I click on {string} link")
    public void i_click_on_link(String expectedText) {
        if(expectedText.equals(homePage.userModule.getText())){
            homePage.userModule.click();

        }else {
            System.out.println("Expected text not matching the actual text");
        }

    }
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(int expectedDefaultValueOnShowRecords) {
        Select select = new Select(userpage.showRecords);
        String actualDefaultValue = select.getFirstSelectedOption().getText();
        int actualValueInInteger = Integer.parseInt(actualDefaultValue);

        Assert.assertEquals(expectedDefaultValueOnShowRecords,actualValueInInteger);
      
    }

    @Then("show records should have following options")
    public void show_records_should_have_following_options(List<String> expectedRecordList) {

        List<String> actualListOfSHowRecords = BrowserUtils.getElementsText(userpage.listShowRecords);

      Assert.assertEquals(expectedRecordList,actualListOfSHowRecords);
    }
}
