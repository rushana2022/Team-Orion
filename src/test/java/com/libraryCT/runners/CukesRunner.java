package com.libraryCT.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/libraryCT/step_definitions",
        dryRun = false, // true - will print snippets only, false - will open a browser and print snippets
        tags = "@US01",
        publish = true
)
public class CukesRunner {}


