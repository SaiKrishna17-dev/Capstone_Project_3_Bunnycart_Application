package com.Bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Bunnycart.Features\\SignIn.feature",
glue= {"com.Bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreports/SignInReport.html"},
monochrome=true)
public class SignInTestRunner extends AbstractTestNGCucumberTests {

}