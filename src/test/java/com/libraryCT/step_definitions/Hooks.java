package com.libraryCT.step_definitions;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;


public class Hooks {

    @Before(order = 1)
    public void setupMethod() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }


    //@Before (value = "@login", order = 2 )
    public void login_scenario_before() {
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void teardownMethod(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }
}
