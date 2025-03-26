package com.Bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Bunnycart.Features\\LogOut.feature",
glue= {"com.Bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreports/LogOutReport.html"},
monochrome=true)
public class LogOutTestRunner extends AbstractTestNGCucumberTests {

}
