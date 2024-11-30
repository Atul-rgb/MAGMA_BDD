package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import POM.DefaultPage;
import POM.GeneralProposal;
import POM.LoginPage;
import POM.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class GeneralPraposalStepDefination  {
	WebElement changePassword_link;
	WebDriver driver;
	TestContextSetup testContextSetup;
	GeneralProposal generalProposal;
	DefaultPage defaultPage;
	PageObjectManager pageObjectManager;
	SoftAssert softassert;
	 

	public GeneralPraposalStepDefination(TestContextSetup testContextSetup) throws Exception {
		 this.testContextSetup=testContextSetup;
		
		 driver =testContextSetup.base.lounchBrowser();
		 defaultPage=new DefaultPage(driver);
		 generalProposal=new GeneralProposal(driver);
		 softassert=new SoftAssert();
	}
	

	@Then("GeneralProposal page is open")
	public void User_on_View_Manage_Inward_page() throws Exception {
		
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
		System.out.println("============================================"+currentutl);
	boolean b= 	currentutl.contains("GeneralProposal");
	softassert.assertEquals(b, true);
	softassert.assertAll();
	}
	@And("Select policy variant dropdown {string}")
	public void Select_policy_variant_dropdown(String str) throws Exception {
		generalProposal.select_policy_variant(str);
	
	}
	@And("Select insured person relationship dropdown {string}")
	public void Select_insured_person_relationship_dropdown(String str) throws Exception {
		generalProposal.select_insured_person_relationship(str);
	
	}
	
	
	
}
