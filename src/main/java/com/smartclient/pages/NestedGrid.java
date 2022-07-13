package com.smartclient.pages;

import com.smartclient.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedGrid extends Utility {
    private static final Logger log = LogManager.getLogger(NestedGrid.class.getName());

    public NestedGrid() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//div[@id='isc_EH']//table[@role='presentation']")
    WebElement dropdownItemAsc;


    public void clickToSortAsc(){
        dropdownItemAsc.click();
    }

}
