package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Comman_Cod;

public class AddEditInwards {
	
	WebDriver ldriver;
	WebDriverWait wait;
	Select select;
	Comman_Cod comman_Cod;
	
	public AddEditInwards(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		comman_Cod=new Comman_Cod(ldriver);
	}
	
	@FindBy (xpath="//td[text()='Business Type:']//span")
	@CacheLookup
	  WebElement BussinessType_MandatoryMark;
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddlBusinessType']//option[@selected='selected']")
	@CacheLookup
	  WebElement BussinessType_dropdown_value;
	@FindBy (xpath="//select[@id='ctl00_PageBodyControls_ddlBusinessType']")
	@CacheLookup
	  WebElement BussinessType_dropdown;
	@FindBy (id="ctl00_PageBodyControls_ddlTransactionType")
	@CacheLookup
	  WebElement Transaction_Type_dropdown;
	@FindBy (xpath="//input[@id='ctl00_PageBodyControls_txtClientName'] //following::img[@id='Img1']")
	@CacheLookup
	  WebElement client_code_search_Icon;
	@FindBy (xpath="//a[@id='ctl00_PageBodyControls_A2']//img")
	@CacheLookup
	  WebElement bussiness_Relation_search_Icon;
	
	@FindBy (id="ctl00_PageBodyControls_PopCalendar2_Control")
	@CacheLookup
	  WebElement calendar_policy_startdate;
	@FindBy (xpath="//span[@class=\" CurrentDateStyle\"]")
	@CacheLookup
	  WebElement calendar_date;
	@FindBy (id="ctl00_PageBodyControls_btnSave")
	@CacheLookup
	  WebElement submit_button;
	@FindBy (xpath="//td[text()='Transaction Type:']//span")
	@CacheLookup
	  WebElement Transaction_Type_Mandatary_mark;
	@FindBy (xpath="//b[contains(text(),'Inward added successfully')]")
	@CacheLookup
	  WebElement popup_Inward_Success;
	@FindBy (xpath="//img[@id='ctl00_PageBodyControls_imgOK']")
	@CacheLookup
	  WebElement popup_OK_button;
	@FindBy (id="ctl00_PageBodyControls_txtBusinessRelation")
	@CacheLookup
	  WebElement bussiness_relation_field;
	@FindBy (id="ctl00_PageBodyControls_txtClientSearch")
	@CacheLookup
	  WebElement clientcodename;
	@FindBy (id="ctl00_PageBodyControls_btnSave")
	@CacheLookup
	  WebElement update_Button;
	@FindBy (xpath="//div[@class='PopUpAlertMessage']//b")
	@CacheLookup
	  WebElement update_popup_message;
	@FindBy (id="ctl00_PageBodyControls_imgOK")
	@CacheLookup
	  WebElement update_popup_OK_button;
	@FindBy (id="ctl00_PageBodyControls_btnQcselect")
	@CacheLookup
	  WebElement select_QC_button;
	@FindBy (xpath="//input[@id='grdQCCheckList_ctl02_ChkQC']")
	@CacheLookup
	  WebElement Check_box_QC_list_calculation;
	@FindBy (xpath="//iframe[contains(@src,'QC')]")
	@CacheLookup
	  WebElement iframe_QC_list;
	
	@FindBy (id="btnSubmit")
	@CacheLookup
	  WebElement QC_check_list_submit_button;
	@FindBy (id="btnback")
	@CacheLookup
	  WebElement QC_check_list_closed_button;
	
	@FindBy (xpath="//span[text()='Saved Successfully.']")
	@CacheLookup
	  WebElement Qc_list_submit_message;

	@FindBy (id="ctl00_PageBodyControls_ddlQCStatus")
	@CacheLookup
	  WebElement processed_status_dropdown;
	@FindBy (id="ctl00_PageBodyControls_txtQCRemarks")
	@CacheLookup
	  WebElement processed_status_remark;
	@FindBy (id="ctl00_PageBodyControls_btnSave")
	@CacheLookup
	  WebElement QC_Upadte_button;
	@FindBy (xpath="//b[contains(text(),'QC')]")
	@CacheLookup
	  WebElement QC_done_Success_message;
	@FindBy (id="ctl00_PageBodyControls_imgOK")
	@CacheLookup
	  WebElement QC_done_popup_OK_button;
	@FindBy (xpath="//img[@alt='Proceed For Receipt Collection']")
	@CacheLookup
	  WebElement collection_mapping_button;
	@FindBy (id="ctl00_PageBodyControls_txtProposalamount")
	@CacheLookup
	  WebElement  praposal_amount;
	public void enter_praposal_amount(String str) {
		praposal_amount.sendKeys(str);
	}
	
	public void click_collection_mapping_button() {
		collection_mapping_button.click();
	}
	
	public void click_QC_done_popup_OK_button() {
		QC_done_popup_OK_button.click();
	}
	
	public String check_QC_done_Success_message()
	{
		return QC_done_Success_message.getText();
	}
	
	public void click_QC_Upadte_button() {
		QC_Upadte_button.click();
	}
	
	public void enter_remark(String str) throws Exception {
		comman_Cod.waitLoader();
		processed_status_remark.sendKeys(str);
	}
	
	public void select_processed_status_dropdown(String str) throws Exception
	{
		select=new Select(processed_status_dropdown);
		comman_Cod.waitLoader();
	
	select.selectByVisibleText(str);
	}
	public String check_QC_list_submit_message()
	{
		return Qc_list_submit_message.getText();
	}
	public void click_QC_check_list_closed_button() {
		QC_check_list_closed_button.click();
		comman_Cod.shitch_to_Parent();
	}
	
	public void click_QC_check_list_submit_button() {
		QC_check_list_submit_button.click();
	}
	public void switch_to_QC_Iframe()
	{
		comman_Cod.shitch_to_Iframe(iframe_QC_list);
	}
	public void click_Check_box_QC_list_calculation() {
		Check_box_QC_list_calculation.click();
	}
	
	public void click_select_QC_button() {
		select_QC_button.click();
	}
	
	
	public void click_update_popup_OK_button() {
		update_popup_OK_button.click();
	}
	
	public String  check_DCN_update_popup_message() {
		return update_popup_message.getText();
	}
	
	public void click_update_button()
	{
		comman_Cod.javascript_click_specific_element(update_Button);
	}
	public String clientcodename_text() {
		return clientcodename.getAttribute("value");
		}
	public String bussiness_relation_field_text() {
		return bussiness_relation_field.getAttribute("value");
		}
	public String popup_text() {
	return	popup_Inward_Success.getText();
	}
	public String popup_DCN() {
		String message=	popup_Inward_Success.getText();
      int startIndex = message.indexOf("HB");
        
        // Extract the document control number using substring
        String documentControlNo = message.substring(startIndex);
        return documentControlNo;
		}
	public void Click_popup_OK_button() throws Exception {
		comman_Cod.waitLoader();
		popup_OK_button.click();
		}
	
	public boolean checkTransaction_Type_Mandatary_mark()
	{
	 return	Transaction_Type_Mandatary_mark.isDisplayed();
	}
	
	public void click_bussiness_Relation_search_Icon() throws Exception
	{
		bussiness_Relation_search_Icon.click();
		Thread.sleep(3000);
		
	}
	public void click_client_code_search_Icon() throws Exception
	{
		client_code_search_Icon.click();
		Thread.sleep(3000);
		comman_Cod.waitLoader();
	}
	public void select_Bussiness_type_dropdown(String str) {
		select=new Select(BussinessType_dropdown);
		select.selectByVisibleText(str);
	}
	public boolean check_BussinessType_MandatoryMark()
	{
	 return 	BussinessType_MandatoryMark.isDisplayed();
	}
	public String check_BussinessType_dropdown_value()
	{
	 return 	BussinessType_dropdown_value.getText();
	}
	public String check_BussinessType_dropdown_textvalue()
	{
	 return 	BussinessType_dropdown.getText();
	}
	public void select_Transaction_Type_dropdown(String str) {
		select=new Select(Transaction_Type_dropdown);
		select.selectByVisibleText(str);
	}
	public void click_calendar_policy_startdateicon() {
		
		comman_Cod.javascript_click_specific_element(calendar_policy_startdate);
		//calendar_policy_startdate.click();
	}
    public void select_date_from_calender() throws Exception {
    	calendar_date.click();
    	comman_Cod.waitLoader();
    }
    public void click_submit_button() {
    	//submit_button.click();
    	comman_Cod.javascript_click_specific_element(submit_button);
    }
    
	
}
