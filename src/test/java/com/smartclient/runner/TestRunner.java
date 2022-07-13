package com.smartclient.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Created by Bhavesh Patel
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/smartclient",
        plugin = { "pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"
        }
        //tags = "@Smoke,"

)
public class TestRunner {
        @AfterClass
        public static void setUp() {
                String projectPath = System.getProperty("user.dir");
                String reportConfigPath = projectPath + "/src/test/java/resources/extentreport/extent-config.xml";
                Reporter.loadXMLConfig(reportConfigPath);
                Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
                Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
                Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
                Reporter.setSystemInfo("Selenium", "4.1.3");
                Reporter.setSystemInfo("Maven", "3.8.6");
                Reporter.setSystemInfo("Java Version", "1.8.0_151");
        }


}
