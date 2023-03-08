package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody//tr//td[3]")
    public WebElement confirmBookName;

    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> idNumbers;

    @FindBy(xpath = "(//select)[3]")
    public WebElement selectDropDown;

    @FindBy(xpath = "//select[@name='tbl_users_length']//option")
    public List<WebElement> allElements;

    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> allEmails;

    @FindBy(xpath = "//th")
    public List<WebElement> allColumnNames;

    @FindBy(xpath = "(//a//span)[5]")
    public WebElement nameOfStudent;

    @FindBy(xpath = "(//a//span)[7]")
    public WebElement nameOfLibrarian;

    @FindBy(xpath = "//span[contains(.,'Dashboard')]")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//th")
    public List<WebElement> keysMap;

    @FindBy(xpath = "//td")
    public List<WebElement> valuesMap;

    @FindBy(xpath = "//span//a")
    public WebElement addUserBtn;

    @FindBy(xpath = "//label[@class='control-label']")
    public List<WebElement> labels;

    @FindBy(xpath = "//input[@class='form-control']")
    public List<WebElement> placeHolders;

    @FindBy(id = "address")
    public WebElement textarea;



    public void navigateTo(String page) { // Dashboard, Users, Books
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//span[.='" + page + "']"));
        linkToPage.click();
    }

    public void clickAny(int num) { // 5,10,15,50,100,200,500
        WebElement clickAnyNum = Driver.getDriver().findElement(By.xpath("//option[@value='" + num + "']"));
        clickAnyNum.click();
    }

    public String value(int num){
        WebElement clickAnyNum = Driver.getDriver().findElement(By.xpath("//option[@value='" + num + "']"));
        return clickAnyNum.getAttribute("value");
    }

    public int records(){
        List<WebElement> recordsNumber = Driver.getDriver().findElements(By.xpath("//tr//td[2]"));
        return recordsNumber.size();
    }
}
