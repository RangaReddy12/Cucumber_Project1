package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = {"featureFiles"},tags = ("@addemp"),glue = {"stepDefination"},
monochrome = true, plugin = {"pretty","html:target/addemp/cucumber",
		 "junit:target/addemp/cucumber.xml","json:target/addemp/cucumber.json"})
public class AddEmployee extends AbstractTestNGCucumberTests{

}
