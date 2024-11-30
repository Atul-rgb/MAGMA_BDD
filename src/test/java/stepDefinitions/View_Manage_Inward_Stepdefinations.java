package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.DefaultPage;
import POM.View_Manage_Inward;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class View_Manage_Inward_Stepdefinations {

	TestContextSetup testContextSetup;

	WebDriver driver;
	View_Manage_Inward view_Manage_Inward;
	DefaultPage defaultPage;
	SoftAssert softAssert;
	
	public View_Manage_Inward_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
	//	homePage=testContextSetup.pageObjectManager.openHomePage();
		
		driver =testContextSetup.base.lounchBrowser();
//		hR_Upolad_Member=new HR_Upolad_Member(driver);
		view_Manage_Inward=new View_Manage_Inward(driver);
		defaultPage=new DefaultPage(driver);
		softAssert=new SoftAssert();
	}
	@Then("IN_SCN_01TC_1Verify that the Add New button is clickable")
	public void in_scn__tc_1verify_that_the_add_new_button_is_clickable() {
		view_Manage_Inward.click_inward_Add_buuton();
	}
	@And("Click on edit DCN button")
	public void Click_on_edit_DCN_button() {
		view_Manage_Inward.click_edit_DCN_buuton();
	}
	@And("click proceed for QC button")
	public void click_proceed_for_QC_button() throws Exception {
		view_Manage_Inward.click_Proceed_For_QC_buuton();
	}
	@And("Check collection mapping status is change to YES")
	public void Check_collection_mapping_status() throws Exception {
		//defaultPage.click_Inward_module();
		//defaultPage.click_Sub_inwardModule();
		Thread.sleep(2000);
		defaultPage.open_QC1_bucket();
		
		view_Manage_Inward.enter_dcn(AddEditInwards_Stepdefinations.DCN);
		//	view_Manage_Inward.enter_dcn("HB24110000434");
			view_Manage_Inward.click_search_button();
		
		softAssert.assertEquals(view_Manage_Inward.check_mapping_status().contains("Yes"), true);
		softAssert.assertAll();
	}
	@And("Click proceed_for_praposal butoon")
	public void Click_proceed_for_praposal_butoon() throws Exception {
		view_Manage_Inward.click_proceed_for_praposalbutoon();
	}


	
	

}
