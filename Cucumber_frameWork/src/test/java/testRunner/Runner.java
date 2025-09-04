package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = {"./featureFiles/adminlogin.feature"},
glue = {"stepDefination"},tags = ("@singledata,@Multipedata"), monochrome = true,
plugin = {"pretty","html:target/adminlogin/cucumber",
		 "junit:target/adminlogin/cucumber.xml","json:target/adminlogin/cucumber.json"})
public class Runner extends AbstractTestNGCucumberTests{

}
