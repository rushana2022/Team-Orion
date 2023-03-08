package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myUserStoryLogin {

    public myUserStoryLogin(){
        PageFactory.initElements(Driver.getDriver(),this );
    }

    @FindBy(css = "#inputEmail")
    public WebElement emailInput;

    @FindBy(css = "#inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
    public WebElement accountHolderName;

    @FindBy(xpath = "//span[contains(@class, 'title') and text() = 'Users']")
    public WebElement userModule;

    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUserBtn;


    public void login(String userName, String password) {
        emailInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }
}
