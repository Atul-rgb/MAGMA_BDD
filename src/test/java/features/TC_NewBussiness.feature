
@New_Bussiness
Feature: Automation MAgma

 Background: Scenario_LoginPage 
   Given user on login page
    When Enter userName "N"
    When  Enter password "India@123"
    When  click on Loginbutton
    Then user on Homepage
 
     @Inward
      Scenario Outline: Scenario New_Bussiness Inward
     When Click on grid inward option
     When Click on sub inward option
     When Click on view_manage_Inward_Inward_generate
     When IN_SCN_01TC_1Verify that the Add New button is clickable
     When IN_SCN_01_TC_2Verify that the Add New button navigates to new page where to add inward when it is clicked
     When IN_SCN_02_TC_1To verify that the Business Type is a mandatory dropdown field
     When IN_SCN_02_TC_3Confirm that the Business Type dropdown field has a default value as New Business"<BussinessType>"
     When IN_SCN_02_TC_4Ensure that users can select a business type from the dropdown"<BussinessTypeselect>"
  #  When IN_SCN_02_TC_7Confirm that the selected business type is displayed in the dropdown field after selection"<BussinessTypeselect>"
     When IN_SCN_02_TC_4Ensure that users can select a business type from the dropdown"<BussinessType>"
  #  When IN_SCN_02_TC_5Confirm that the Business Type dropdown contains the expected list of business types
     When IN_SCN_03TC_1Confirm that the transaction Type is a mandatory dropdown field
     When IN_SCN_03_TC_1Confirm that the Transaction Type is a mandatory dropdown field"<Transaction_Type_dropdown>"
     When IN_SCN_09TC_18Verify the functionality of searching by with a valid name "<Searchclient_Name>"
     When IN_SCN_14TC_3Cofirm, if clicked on search option
     When IN_SCN_14TC_5Enter a valid search query and verify results are displayed correctly "<relationName>"
     When IN_SCN_24TC_2Confirm that users can select dates from the Policy Start Date field
     And  Enter praposal amount "<praposalamount>"
     When click submit button
     Then DCN generated sucssesfully
     
     Examples:
     | BussinessType| BussinessTypeselect| Transaction_Type_dropdown |Searchclient_Name|relationName|praposalamount|
     | New Business | Renewal Business   |Policy                     |ambuja           |Rajeev|100|
     
     @dInward
      Scenario Outline: Scenario New_Bussiness Edit_DCN
     Given User on View-Manage-Inward page
     When  Search the DCN
     And  Click on edit DCN button
     And  check page before edit DCN
     And  edit client information "<value1>" and "<value2>"
     And  edit bussiness relation "<value3>" and "<value4>"
     And  click update button
     Then popup reflected with success message"<value5>"
     And  click popup OK button
     
      Examples:
     | value1| value2| value3   |value4    |value5|
     | ambuja| aegis |2210000012|2210000011| Inward updated successfully|
     
      
    
       @Inward
      Scenario Outline: Scenario New_Bussiness Proceed For QC
     Given User on View-Manage-Inward page
     When  Search the DCN
     And  click proceed for QC button
     Then AddEditInwards page open
     And  click Select_QC button
     And  Select QC from list
     And  Click QC_list_submit button
     And  Click QC_list_closed button 
     And   Select processed_status_dropdown "<value1>"
     And  Click QC_list_update button
     Then pop up with success message show "<message>"
     And  closed the popup 
     
      Examples:
     | value1| message|
     | QC|QC Done successfully. Next step is CPC.|
     
      @dInward
      Scenario Outline: Scenario New_Bussiness collection Mapping
     Given User on View-Manage-Inward _QC1_QC_Completed bucket
     When  Search the DCN
     And Click collection_Mapping button
     Then AddEditCollection page open
     And Click Get_collection_Id link and select receipt "<value1>" and "<tagamount>"
     And Click mapping collection button
     And  Closed the Popup
     And  Check collection mapping status is change to YES
     
      Examples:
     | value1              |tagamount|popupmessage|
     |H/400401/25/100000012|1000|Receipt Mapping Successfully.|
     
     
      @Inward
      Scenario Outline: Scenario New_Bussiness Proceed for Praposal
     Given User on View-Manage-Inward CPC bucket
     When  Search the DCN
     And Click proceed_for_praposal butoon
     Then GeneralProposal page is open
     And  Select policy variant dropdown "<policy_variant>"
  #    And  Select insured person relationship dropdown "<insured_person_relationship>"
      Examples:
     | policy_variant              |insured_person_relationship|
     |Individual|Non employee-employer relationship|
     
     
     
   