package stepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {

	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	@After
	public void afterscenario() throws Exception {
		//we create object of base class in  testbaseclass  ,so we use this line of code
//	testContextSetup.base.lounchBrowser().quit();
	}
	
	@AfterStep
	public void screenshot(Scenario scenario) throws Exception {
		WebDriver driver=testContextSetup.base.lounchBrowser();
		if(scenario.isFailed()) {
		File srcpath=	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent=FileUtils.readFileToByteArray(srcpath);
		scenario.attach(filecontent, "image/png", "image");
		}
		else {
			File srcpath=	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(srcpath);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
}
