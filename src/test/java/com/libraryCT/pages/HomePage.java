package com.libraryCT.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul//li[2]")
    public WebElement UsersModule;

    public static void clickTheModuleByStringParameter(WebElement webElement, String parameterText){


        if(parameterText.equals(webElement.getText())){
            webElement.click();
        }else{
            System.out.println("Parameter text NOT MATCHING with the Element's text!!!");
        }
    }
}
