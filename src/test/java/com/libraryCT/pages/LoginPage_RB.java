package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_RB extends BasePage {

    @FindBy(css = "#inputEmail")
    public WebElement emailInput;

    @FindBy(css = "#inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
    public WebElement accountHolderName;

    public void login(String userName, String password) {
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
    }
}
