package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import POM.AddEditInwards;
import POM.Iframe_Search_Bussiness_Source_Information;
import POM.Iframe_Search_Client_Name;
import POM.View_Manage_Inward;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class AddEditInwards_Stepdefinations {

	TestContextSetup testContextSetup;

	WebDriver driver;
	AddEditInwards addEditInwards;
	Iframe_Search_Client_Name iframe_Search_Client_Name;
	Iframe_Search_Bussiness_Source_Information iframe_Search_Bussiness_Source_Information;
	SoftAssert softAssert;
	static String   DCN;
	View_Manage_Inward view_Manage_Inward;
	
	
	public AddEditInwards_Stepdefinations(TestContextSetup testContextSetup) throws Exception{
		this.testContextSetup=testContextSetup;
		
	//	homePage=testContextSetup.pageObjectManager.openHomePage();
		
		driver =testContextSetup.base.lounchBrowser();
//		hR_Upolad_Member=new HR_Upolad_Member(driver);
		addEditInwards=new AddEditInwards(driver);
		iframe_Search_Client_Name=new Iframe_Search_Client_Name(driver);
		iframe_Search_Bussiness_Source_Information=new Iframe_Search_Bussiness_Source_Information(driver);
		view_Manage_Inward=new View_Manage_Inward(driver);
		softAssert=new SoftAssert();
	}
	
	@And("IN_SCN_{int}_TC_2Verify that the Add New button navigates to new page where to add inward when it is clicked")
	public void in_scn__tc_2verify_that_the_add_new_button_navigates_to_new_page_where_to_add_inward_when_it_is_clicked(Integer int1) throws Exception {
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
		System.out.println("============================================"+currentutl);
	boolean b= 	currentutl.contains("AddEditInwards");
	softAssert.assertEquals(b, true);
	softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_1To verify that the Business Type is a mandatory dropdown field")
	public void in_scn__tc_1to_verify_that_the_business_type_is_a_mandatory_dropdown_field(Integer int1) {
		
		softAssert.assertEquals(addEditInwards.check_BussinessType_MandatoryMark(), true);
		softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_3Confirm that the Business Type dropdown field has a default value as New Business{string}")
	public void in_scn__tc_3confirm_that_the_business_type_dropdown_field_has_a_default_value_new_business(Integer int1,String str) {
		String actualvalue=addEditInwards.check_BussinessType_dropdown_value();
		softAssert.assertEquals(actualvalue, str);
		softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_4Ensure that users can select a business type from the dropdown{string}")
	public void in_scn__tc_4ensure_that_users_can_select_a_business_type_from_the_dropdown(Integer int1,String str) {
		addEditInwards.select_Bussiness_type_dropdown(str);
	}
	@And("IN_SCN_{int}_TC_5Confirm that the Business Type dropdown contains the expected list of business types")
	public void in_scn__tc_5confirm_that_the_business_type_dropdown_contains_the_expected_list_of_business_types(Integer int1) {
	 
	}
	@And("IN_SCN_{int}_TC_7Confirm that the selected business type is displayed in the dropdown field after selection{string}")
	public void in_scn__tc_7confirm_that_the_business_type_dropdown_field_has_a_default_value_new_business(Integer int1,String str) {
		String actualvalue=addEditInwards.check_BussinessType_dropdown_textvalue();
		softAssert.assertEquals(actualvalue, str);
		softAssert.assertAll();
	}
	@When("IN_SCN_03TC_1Confirm that the transaction Type is a mandatory dropdown field")
	public void in_scn__tc1ensure_that_users_can_select_a_business_type_from_the_dropdown() {
		softAssert.assertEquals(addEditInwards.checkTransaction_Type_Mandatary_mark(), true);
		softAssert.assertAll();
	}
	@And("IN_SCN_{int}_TC_1Confirm that the Transaction Type is a mandatory dropdown field{string}")
	public void in_scn__tc_1ensure_that_users_can_select_a_business_type_from_the_dropdown(Integer int1,String str) {
		addEditInwards.select_Transaction_Type_dropdown(str);
	}
	@When("IN_SCN_09TC_18Verify the functionality of searching by with a valid name {string}")
	public void in_scn__tc_18confirm_that_the_business_type_dropdown_field_has_a_default_value_new_business(String str) throws Exception {
	
		addEditInwards.click_client_code_search_Icon();
		iframe_Search_Client_Name.move_to_iframe();
       iframe_Search_Client_Name.enter_data_SearchBox(str);
       iframe_Search_Client_Name.clicK_HB_Search_Radio_Button();
       Thread.sleep(3000);
       iframe_Search_Client_Name.Click_result_go_button();
       iframe_Search_Client_Name.move_to_parentframe();
		
	}
	@When("IN_SCN_14TC_3Cofirm, if clicked on search option")
	public void in_scn_14tc_3cofirm_if_clicked_on_search_option() throws Exception {
		addEditInwards.click_bussiness_Relation_search_Icon();  
	}
	@When("IN_SCN_14TC_5Enter a valid search query and verify results are displayed correctly {string}")
	public void in_scn_14tc_5enter_a_valid_search_query_and_verify_results_are_displayed_correctly_rajeev(String str) throws Exception {
		iframe_Search_Client_Name.move_to_iframe();
		  Thread.sleep(3000);
		  iframe_Search_Bussiness_Source_Information.enter_data_SearchBox(str);
	      iframe_Search_Bussiness_Source_Information.click_Go_Button();
		   Thread.sleep(3000);
		  iframe_Search_Bussiness_Source_Information.Click_result_go_button();
		  Thread.sleep(3000);
         iframe_Search_Client_Name.move_to_parentframe();
	}
	@When("IN_SCN_24TC_2Confirm that users can select dates from the Policy Start Date field")
	public void in__3cofirm_if_clicked_on_search_option() throws Exception {
		 Thread.sleep(3000);
		addEditInwards.click_calendar_policy_startdateicon();
		addEditInwards.select_date_from_calender();
	}
	@When("Enter praposal amount {string}")
	public void Enter_praposal_amount(String str) throws Exception {
		Thread.sleep(2000);
		addEditInwards.enter_praposal_amount(str);
		
	}
	@When("click submit button")
	public void in_cofirm_if_clicked_on_search_option() throws Exception {
		
		addEditInwards.click_submit_button();
		
	}
	
	@When("DCN generated sucssesfully")
	public void DCN_generated_sucssesfully() throws Exception {
		
		String message =addEditInwards.popup_text();
		boolean ans=message.contains("Inward added successfully");
		System.out.println(message);
		softAssert.assertEquals(message.contains("Inward added successfully"), true);
		softAssert.assertAll();	
	 DCN=	addEditInwards.popup_DCN();
	System.out.println(DCN);
	}
	@When("Search the DCN")
	public void Search_the_DCN() throws Exception {
	
		view_Manage_Inward.enter_dcn(DCN);
	//	view_Manage_Inward.enter_dcn("HB24110000434");
		view_Manage_Inward.click_search_button();
		
	}
	@When("check page before edit DCN")
	public void check_page_before_edit_dcn() {
	  
	}
	@When("edit client information {string} and {string}")
	public void edit_client_information_and(String string, String string2) throws Exception {
	
		String clientcode=addEditInwards.clientcodename_text();
		addEditInwards.click_client_code_search_Icon();
		iframe_Search_Client_Name.move_to_iframe();
		if(clientcode.contains("1700000023")) {
         iframe_Search_Client_Name.enter_data_SearchBox(string2);
		}else{
			 iframe_Search_Client_Name.enter_data_SearchBox(string);	
		}
       iframe_Search_Client_Name.clicK_HB_Search_Radio_Button();
       Thread.sleep(3000);
       iframe_Search_Client_Name.Click_result_go_button();
       iframe_Search_Client_Name.move_to_parentframe();
		
	}
	
	@When("edit bussiness relation {string} and {string}")
	public void edit_bussiness_relation_information_and(String string, String string2) throws Exception {
		String clientcode=addEditInwards.bussiness_relation_field_text();
		addEditInwards.click_bussiness_Relation_search_Icon();  
		iframe_Search_Client_Name.move_to_iframe();
		  Thread.sleep(3000);
		  if(clientcode.contains(string)) {
		  iframe_Search_Bussiness_Source_Information.enter_data_SearchBox(string2);
		  }else {
		  iframe_Search_Bussiness_Source_Information.enter_data_SearchBox(string);
		  }
	      iframe_Search_Bussiness_Source_Information.click_Go_Button();
		   Thread.sleep(3000);
		  iframe_Search_Bussiness_Source_Information.Click_result_go_button();
		  Thread.sleep(3000);
         iframe_Search_Client_Name.move_to_parentframe();
	}
	@And("click update button")
	public void click_update_button() throws Exception {
		addEditInwards.click_update_button();
	}
	@And("popup reflected with success message{string}")
	public void popup_reflected_with_success_message(String str) throws Exception {
	String message=	addEditInwards.check_DCN_update_popup_message();
	softAssert.assertEquals(message.contains("Inward updated successfully"), true);
	softAssert.assertAll();	
	
	}
	@And("click popup OK button")
	public void click_popup_OK_button() throws Exception {
		addEditInwards.click_update_popup_OK_button();
	}
	@Then("AddEditInwards page open")
	public void AddEditInwards_page_open() throws Exception {
		
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
		System.out.println("============================================"+currentutl);
	boolean b= 	currentutl.contains("AddEditInwards");
	softAssert.assertEquals(b, true);
	softAssert.assertAll();
	}
	@And("click Select_QC button")
	public void click_Select_QC() throws Exception {
		addEditInwards.click_select_QC_button();
	}
	@And("Select QC from list")
	public void Select_QC_from_list() throws Exception {
		Thread.sleep(4000);
		addEditInwards.switch_to_QC_Iframe();
		addEditInwards.click_Check_box_QC_list_calculation();
	}
	@And("Click QC_list_submit button")
	public void Click_QC_list_submit_button() throws Exception {
		addEditInwards.click_QC_check_list_submit_button();
		
		softAssert.assertEquals(addEditInwards.check_QC_list_submit_message(), "Saved Successfully.");
		softAssert.assertAll();
	}
	@And("Click QC_list_closed button")
	public void Click_QC_list_closed_button() throws Exception {
		addEditInwards.click_QC_check_list_closed_button();
	}
	@When("Select processed_status_dropdown {string}")
	public void Select_processed_status_dropdown(String str) throws Exception {
		addEditInwards.select_processed_status_dropdown(str);
		addEditInwards.enter_remark(str);
		System.out.println("======================"+str);
	}
	@And("Click QC_list_update button")
	public void click_QC_Upadte_button() throws Exception {
		addEditInwards.click_QC_Upadte_button();
	}
	@Then("pop up with success message show {string}")
	public void pop_up_with_success_message_show(String str) throws Exception {  	
		softAssert.assertEquals(addEditInwards.check_QC_done_Success_message(), str);
		softAssert.assertAll();
	}
	@And("closed the popup")
	public void closed_the_popup() throws Exception {
		addEditInwards.click_QC_done_popup_OK_button();
	}
	@And("Click collection_Mapping button")
	public void Click_collection_Mapping_button() {
		addEditInwards.click_collection_mapping_button();
	}
	
}
