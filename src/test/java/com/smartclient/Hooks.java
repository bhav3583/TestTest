package com.smartclient;

import com.cucumber.listener.Reporter;
import com.smartclient.propertyreader.PropertyReader;
import com.smartclient.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
/**
 * Created by bhavesh patel
 */
public class Hooks extends Utility {

   @Before
   public void setUp(){
       selectBrowser(PropertyReader.getInstance().getProperty("browser"));
       //Reporter.assignAuthor("Bhavesh Patel");
   }

   @After
   public void tearDown(Scenario scenario) {
       if (scenario.isFailed()) {
           String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
           try {
               Reporter.addScreenCaptureFromPath(screenShotPath);
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       closeBrowser();
   }

}
