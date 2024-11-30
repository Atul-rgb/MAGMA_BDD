package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import POM.AddEditCollection;
import POM.DefaultPage;
import POM.LoginPage;
import POM.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class AddEditCollection_StepDefination  {
	WebElement changePassword_link;
	WebDriver driver;
	TestContextSetup testContextSetup;
	public LoginPage  loginPage;
	DefaultPage defaultPage;
	PageObjectManager pageObjectManager;
	AddEditCollection addEditCollection;
	SoftAssert softassert;
	 

	public AddEditCollection_StepDefination(TestContextSetup testContextSetup) throws Exception {
		 this.testContextSetup=testContextSetup;
		 loginPage=testContextSetup.pageObjectManager.openLoginPage();
		 driver =testContextSetup.base.lounchBrowser();
		 defaultPage=new DefaultPage(driver);
		 addEditCollection=new AddEditCollection(driver);	
		 softassert=new SoftAssert();
		 
	}
	@And("Click Get_collection_Id link and select receipt {string} and {string}")
	public void Click__on_Inward_link(String str,String str2) throws Exception {
		addEditCollection.click_get_collection_id();
		addEditCollection.enter_data_in_search_box(str);
		addEditCollection.click_iframe_Go_button();
		
		addEditCollection.click_iframe_result_go_button();
		addEditCollection.click_check_box_recept();
	//	addEditCollection.enter_tag_amount_field(str2);
	}
	
	
	@Then("AddEditCollection page open")
	public void User_on_View_Manage_Inward_QC1_QC_Completedbucket() throws Exception {
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
		System.out.println("============================================"+currentutl);
	boolean b= 	currentutl.contains("AddEditCollection");
	softassert.assertEquals(b, true);
	softassert.assertAll();
	}
	@And("Closed the Popup")
	public void Closed_the_Popup() throws Exception {
		addEditCollection.Click_collection_tagging_popup_ok_button();
		
	}
	@And("Click mapping collection button")
	public void Click_mapping_collection_button() throws Exception {
		addEditCollection.Click_mapping_collection_button();
		
	}
	@And("Check collection mapping status")
	public void Check_collection_mapping_status() throws Exception {
	//	addEditCollection.Click_mapping_collection_button();
		
	}
	
	
}
