package com.ebay.Pages;

import com.ebay.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }






}
