package com.ebay.Pages;

import com.ebay.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IphonePage extends BasePage{
    public IphonePage () {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy (xpath = "//div[@id='srp-river-results']/ul/li")
    public List<WebElement> iphonePrdc;

    public void getNthResult(int productNumber){
        String xpathExpression=String.format("//div[@id='srp-river-results']/ul/li[%d]",productNumber);
        WebDriver driver=null;
        driver.findElement(By.xpath(xpathExpression)).getText();
    }

    public List<String> getAllProducts(String expectedBrand){
        ArrayList<String> brand=new ArrayList<String>();
        Iterator<WebElement> itertorAllProdcs=iphonePrdc.iterator();
        while (itertorAllProdcs.hasNext()){
            WebElement product=itertorAllProdcs.next();
            if(product.getText().toUpperCase().contains(expectedBrand.toUpperCase())){
                brand.add(product.getText());
            }

        }


        return brand;
    }}
