package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserPage extends BasePage{

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecords;


    @FindBy(xpath = "//select[@name='tbl_users_length']//option")
    public List<WebElement> listShowRecords;


}

