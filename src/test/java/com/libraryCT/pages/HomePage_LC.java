package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_LC extends BasePage {


    @FindBy(xpath = "//ul//li[2]")
    public WebElement UsersModule;
}
