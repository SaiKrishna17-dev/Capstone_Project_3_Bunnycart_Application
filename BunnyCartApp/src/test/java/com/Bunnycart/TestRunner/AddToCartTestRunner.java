package com.Bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Bunnycart.Features\\AddToCart.feature",
glue= {"com.Bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreports/AddToCartReport.html"},
monochrome=true)
public class AddToCartTestRunner extends AbstractTestNGCucumberTests {

}
