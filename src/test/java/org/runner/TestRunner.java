package org.runner;

import org.base.function.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
                 glue="org.stepDefinition",
                 dryRun=false,
                 monochrome=true,
                 plugin= {"pretty",
                		 "html:src\\test\\resources\\Reports\\Html report",
                		 "json:src\\test\\resources\\Reports\\Json report\\jsonreport.json",
                		 "junit:src\\test\\resources\\Reports\\Junit report\\junitreport.xml"}
                 )

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("src\\test\\resources\\Reports\\Json report\\jsonreport.json");
        System.out.println("--------report generated---------");		
	}
	
}
