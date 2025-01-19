package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/login.feature",glue= {"StepsDif"},

plugin = {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/cucumber-reports.html"},
monochrome=true,
tags = "@RunAll"
)
public class Runner {

}
