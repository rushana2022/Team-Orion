package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibrarianUserPageML extends BasePage{

    @FindBy (xpath = "//span[contains(text(), 'Users')]")
    public WebElement usersModuleButton;

}
