package Runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import gherkin.formatter.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Selenium_Workspace\\BDDframework\\src\\main\\java\\Features\\Login.Feature"
		,glue= {"stepdefinition"},
	//format= {"pretty","html:test:output"}
				 plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},

		 monochrome = true
		 )

public class Testrunner {
	@AfterClass
    public static void writeExtentReport() {
		  Reporter.loadXMLConfig("src/extent-config.xml");
    }
}