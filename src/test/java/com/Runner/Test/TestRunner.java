package com.Runner.Test;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "@VeifyPIMtab", features = {"Features/"}, glue = {"com.Stepdefinition.Test"},
plugin = {"pretty", "json:target/CucumberTestReport.json", "html:target/CucumberTestReport.html"})
    
public class TestRunner extends AbstractTestNGCucumberTests {
    
}


//"pretty", "json:target/CucumberTestReport.json", "html:target/CucumberTestReport.html"