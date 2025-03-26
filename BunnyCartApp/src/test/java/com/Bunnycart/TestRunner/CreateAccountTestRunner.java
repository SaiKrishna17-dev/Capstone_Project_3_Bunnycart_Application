package com.Bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Bunnycart.Features\\CreateAccount.feature",
glue= {"com.Bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreports/CreateAccountReport.html"},
monochrome=true)
public class CreateAccountTestRunner extends AbstractTestNGCucumberTests {

}