package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//th")
        public List<WebElement> columns;

    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> allEmails;
}
