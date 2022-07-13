package com.smartclient.utility;

import com.google.common.base.Function;
import com.smartclient.drivermanager.ManageDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

/**
 * Created by Bhavesh Patel
 */
public class Utility extends ManageDriver {

        //*****************BASIC WEBDRIVER METHODS******************************

        public void pmClickOnElement(WebElement element) {
            element.click();
        }
                /**
         * This method will send text on element
         */
        public void pmSendTextToElement(WebElement element, String text) {
            element.sendKeys(text);
        }

//*************************** Select Class Methods ***************************************//

        /**
         * This method will select the option by visible text
         */
        public void pmSelectByVisibleTextFromDropDown(By by, String text) {
            WebElement dropDown = driver.findElement(by);
            Select select = new Select(dropDown);
            select.selectByVisibleText(text);
        }

        public void pmSelectByVisibleTextFromDropDown(WebElement element, String text) {
            Select select = new Select(element);
            select.selectByVisibleText(text);
        }


       //*************************** Action Methods ***************************************//


        public void pmMouseHoverAndClick(WebElement element) {
            Actions hover = new Actions(driver);
            hover.moveToElement(element).click().build().perform();
        }

        /**
         * This Method will hover mouse on one element, then on second element
         * and click the second element
         */
        public void doMouseHoverOnFirstThenSecondAndClick(By by1, By by2) {
            Actions hover = new Actions(driver);
            WebElement destination1 = driver.findElement(by1);
            WebElement destination2 = driver.findElement(by2);
            hover.moveToElement(destination1).moveToElement(destination2).click().build().perform();
        }

        /**
         * This method performs a Right Click Mouse Action at the current mouse location
         *
         * @param by
         */
        public void doRightClick(By by) {
            Actions rightClick = new Actions(driver);
            WebElement a = driver.findElement(by);
            rightClick.contextClick(a).build().perform();
        }

        /**
         * This method performs click and hold at the source location, moves to target location
         * and then releases the mouse
         *
         * @param source
         * @param target
         */
        public void doDragAndDrop(By source, By target) {
            Actions builder = new Actions(driver);
            WebElement draggable = driver.findElement(source);
            WebElement droppable = draggable.findElement(target);
            builder.dragAndDrop(draggable, droppable).build().perform();
        }

        /**
         * Moves the slider from its current position to the desired position
         *
         * @param sliderBar
         * @param sliderBox
         * @param xAxis
         * @param yAxis
         */
        public void doSliderMovement(By sliderBar, By sliderBox, int xAxis, int yAxis) {
            Actions moveSlider = new Actions(driver);
            WebElement mainSlider = driver.findElement(sliderBar);
            WebElement slider = driver.findElement(sliderBox);
            moveSlider.dragAndDropBy(slider, xAxis, yAxis).build().perform();
        }

//************************** Waits Methods *********************************************//

        /**
         * This method will use to wait until  VisibilityOfElementLocated
         */
        public WebElement pmWaitUntilVisibilityOfElementLocated(By by, int timeout) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return driver.findElement(by);
        }


        /**
         * This method will wait for an element using Fluent Wait
         *
         * @param by
         * @param time
         * @param pollingTime
         * @return
         */
        public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(time))
                    .pollingEvery(Duration.ofSeconds(pollingTime))
                    .ignoring(NoSuchElementException.class);

            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
            return element;
        }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/smartclient/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }


    }



