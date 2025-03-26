package com.Bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Bunnycart.Features\\AddingMultipleProductsToCart.feature",
glue= {"com.Bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreports/AddingMultipleProductsToCartReport.html"},
monochrome=true)
public class AddMultipleProductsToCartTestRunner extends AbstractTestNGCucumberTests {

}
