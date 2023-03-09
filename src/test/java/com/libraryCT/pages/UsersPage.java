package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//th")
    public List<WebElement> keysMap;

    @FindBy(xpath = "//td")
    public List<WebElement> valuesMap;

    @FindBy (xpath = "//tbody//td[2]")
    public List<WebElement> usersIdList;


    public void navigateTo(String page) { // Dashboard, Users, Books
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//span[.='" + page + "']"));
        linkToPage.click();
    }

    public String value(int num){
        WebElement clickAnyNum = Driver.getDriver().findElement(By.xpath("//option[@value='" + num + "']"));
        return clickAnyNum.getAttribute("value");
    }

    public boolean isPageDisplayed(String module){
        WebElement modules = Driver.getDriver().findElement(By.xpath("//span[.='"+module+"']"));

        return modules.isDisplayed();

    }

}
