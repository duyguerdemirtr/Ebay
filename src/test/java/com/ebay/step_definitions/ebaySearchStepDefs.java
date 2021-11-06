package com.ebay.step_definitions;

import com.ebay.Pages.HomePage;
import com.ebay.Pages.IphonePage;
import com.ebay.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ebaySearchStepDefs {
    WebDriver driver;
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        HomePage homePage=new HomePage();
        homePage.navigateToLoginPage();
        BrowserUtils.waitFor(2);
        homePage.acceptAll.click();
        BrowserUtils.waitFor(2);

    }

    @When("I enter {string} in search box")
    public void iEnterInSearchBox(String iphone) {
        HomePage homePage=new HomePage();
        homePage.searchBox.sendKeys(iphone);
    }

    @And("I choose {string} option from All Categories")
    public void iChooseOptionFromAllCategories(String option) {
        HomePage homePage=new HomePage();
        homePage.SelectOption(option);
    }

    @And("I click to search button")
    public void iClickToSearchButton() {
        HomePage homePage=new HomePage();
        homePage.submit.click();

    }
    @Then("I should able to see all {string} products")
    public void iShouldAbleToSeeAllProducts(String Iphone) {
        IphonePage iphonePage=new IphonePage();
        int actualNum=iphonePage.getAllProducts(Iphone).size();
        System.out.println("actualNum = " + actualNum);
        int expectedNum=iphonePage.iphonePrdc.size();
        System.out.println("expectedNum = " + expectedNum);
        Assert.assertEquals(expectedNum,actualNum);

    }


}
