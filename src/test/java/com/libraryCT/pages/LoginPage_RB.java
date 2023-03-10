package com.libraryCT.pages;

import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_RB extends BasePage {

    @FindBy(css = "#inputEmail")
    public WebElement emailInput;

    @FindBy(css = "#inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;


    public void onTheLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }

    public void login(){
        emailInput.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        signInBtn.click();
    }

    public void login(String userName, String password) {
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }
}
