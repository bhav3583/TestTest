package com.smartclient.pages;

import com.smartclient.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utility {
    /**
     * logger defined to print log
     */
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='popupPPC']/a[2]")
    WebElement iAgree;

    @CacheLookup
    @FindBy(xpath = "//td[@id='isc_SideNavTree_0_valueCell8']")
    WebElement grid;

    @CacheLookup
    @FindBy(xpath = "//input[@name='commonName']")
    WebElement animalField;

    @CacheLookup
    @FindBy(xpath = "//div[@eventproxy='isc_SliderItem_3_slider_track']")
    WebElement sliderTrack;

    @CacheLookup
    @FindBy(xpath = "//div[@eventproxy='isc_SliderItem_3_slider_thumb']")
    WebElement slider;

    @CacheLookup
    @FindBy(xpath = "//*[@eventproxy='sortForm']//*[@class='selectItemPickerIcon']")
    WebElement sortByDropDown;

    @CacheLookup
    @FindBy(xpath = "//*[@class='pickListMenuBody']/div/table/tbody/tr[2]")
    WebElement lifeSPan;

    @CacheLookup
    @FindBy(xpath = "//*[@class='labelAnchor']/span")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//td[@id='isc_SideNavTree_0_valueCell16']")
    WebElement dropDownGrid;

    @CacheLookup
    @FindBy(xpath = "//*[@role='treeitem']//*[contains(text(),'Dropdown Grid')]")
    WebElement gridDropDownField;

    @CacheLookup
    @FindBy(xpath = "//*[@class='homeInterfacePage']//*[@class='normal'][2]//span[@role='button']//span[@class='comboBoxItemPicker']")
    WebElement itemDropDown;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]")
    WebElement sideScrollBar;

    @CacheLookup
    @FindBy(xpath = "//*[@role='listbox']//div[@class = 'vScrollThumb']")
    WebElement scroll1;

    @CacheLookup
    @FindBy(xpath = "//*[@class='pickListCell']//*[text()='Exercise Book Sewn 240 Page']")
    WebElement items1;

    @CacheLookup
    @FindBy(xpath = "//*[@class='selectItemLiteControl']//*[text()='Exercise Book Sewn 240 Page']")
    WebElement excercise;

    @CacheLookup
    @FindBy(xpath = "//*[@eventproxy='isc_SideNavTree_0_body_vscroll_thumb']")
    WebElement scrollMain;

    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Nested Grid')]")
    WebElement featureNestedGridTab;

    public void clickOnNestedGridTab() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on Nested Grid : "+ featureNestedGridTab.toString());
        featureNestedGridTab.click();
    }


    public void clickOnIAgreeButton() {
        pmClickOnElement(iAgree);

    }

    public void clickOnTileSortAndFiltering() {
        pmClickOnElement(grid);
    }

    public void enterAInAnimalField(String text) throws InterruptedException {
        pmSendTextToElement(animalField, "a");
    }

    public void dragSlider() throws InterruptedException {
        Actions actions = new Actions(driver);
        int width = slider.getSize().width;
        System.out.println(width);
        actions.dragAndDropBy(sliderTrack, 22, 0).build().perform();

        Actions actions1 = new Actions(driver);
        actions1.dragAndDropBy(sideScrollBar, 0, 90).build().perform();

    }

    public void selectFromDropDown(String text) throws InterruptedException {
        waitForElementWithFluentWait(By.xpath("//*[@eventproxy='sortForm']//*[@class='selectItemPickerIcon']"),10,2);
        pmClickOnElement(sortByDropDown);
        Thread.sleep(3000);
        pmClickOnElement(lifeSPan);
    }

    public void clickOnCheckBox() {
        pmClickOnElement(checkBox);
    }

    public void verifyResult() {
        List<WebElement> names = (List<WebElement>) driver.findElements(By.xpath("//*[@class='simpleTile']"));
        int actualQuantity = names.size();
        System.out.println(actualQuantity);
        int expectedQuantity = 12;
        Assert.assertNotEquals(actualQuantity, expectedQuantity);
    }

    public void clickOnDropDownGrid() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(scrollMain, 0, 25).build().perform();
        pmClickOnElement(dropDownGrid);
    }

    public void clickOnGridDropDownField() {
        pmClickOnElement(gridDropDownField);
    }

    public void clickOnItemDropDown() throws InterruptedException {
        pmWaitUntilVisibilityOfElementLocated(By.xpath("//*[@class='homeInterfacePage']//*[@class='normal'][2]//span[@role='button']//span[@class='comboBoxItemPicker']"),10);
        pmClickOnElement(itemDropDown);

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(scroll1, 0, 25).build().perform();

        pmWaitUntilVisibilityOfElementLocated(By.xpath("//*[@class='pickListCell']//*[text()='Exercise Book Sewn 240 Page']"),10);
        pmMouseHoverAndClick(items1);
    }


}



