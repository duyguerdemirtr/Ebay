package com.ebay.Pages;

import com.ebay.utilities.ConfigurationReader;
import com.ebay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
    public BasePage () {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath= "//*[@id=\"gdpr-banner-accept\"]")
    public WebElement acceptAll;
    @FindBy(name = "_nkw")
    public WebElement searchBox;
    @FindBy(id = "gh-btn")
    public WebElement submit;
    @FindBy(xpath = "//*[@id=\"gh-minicart-hover\"]/div/a[1]/*")
    public WebElement shopBasket;
    @FindBy(id = "gh-cat")
    public WebElement AllCategories;

    public void navigateToLoginPage(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void getPageTitle(){ Driver.get().getTitle(); }
    public String SelectOption(String option){
        Select AllCatDropDown = new Select(AllCategories);
        AllCatDropDown.selectByVisibleText(option);
        return AllCatDropDown.getFirstSelectedOption().getText();
    }












  /*  public String getPageSubTitle() {
       return pageSubTitle.getText();
    }*/



}
