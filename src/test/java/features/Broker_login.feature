
@Broker_Login
Feature: Automation FG portal

 Background: Scenario_ID_01_LoginPage 
    Given user on Login page
    When TC_001 Verify userNamefield "60016355"
    When  TC_002 Verify passwordfield "Password@355"
    When  TC_003 Verify Group radiobutton is clickable
    When  TC_004 Verify Loginbutton is clickable
    Then user on Homepage
  
  
  @Broker_changePassword
    Scenario: Scenario_ID_02 Broker_ChangePassword TestCases 
    When TC_001 Verify changePassword link is clickable
    When TC_002 Verify oldPassword field "Password@355"
    When TC_003 Verify NewPassword field "Password@355"
    When TC_004 Verify confermPassword field "Password@355"
    When TC_005 Verify submit button 
    Then Successful update password meassage is show
     
   
     
     @Broker_Claim_Request
     Scenario: Scenario_ID_06 Broker_Claim_Request  TestCases 
     Given User on Homepage page
    When  TC_001_Verify Claims Request  sub module is visible and clickable
    When  TC_002_Verify search criteria drop down is visible and clickable"Policy no"
    When  TC_003_Verify search For field is visible and clickable"FGH-2J-17-7000031-00-000"
    When  TC_004_Verify  search Button is visible and vlickable
    When  TC_005_Verify  click here for intimation link is visible and clickable
		When  TC_006_Verify Search Hospital Name  field is visible and select hospital "Apollo"
		When  TC_007_Verify Mobile Number field  is visible and clickable "9604184296"
		When  TC_008_Verify  Email field is visible and clickable "EFIB98@EcoleFrancaiseInternationale.com"
		When  TC_009_Verify Diagnosis field is editable or not "Fever" 
		When  TC_010_Check Date Of Admission is selectable "05-05-2017"
		When  TC_011_Check Date Of Discharge is selectable "05-05-2017"
		When  TC_012_Check Claimed Amount field is visible and clickable "1000"
		When  TC_013_Verify account holder name is available "Jeanbaptiste Bernard Fauchille"
		When  TC_014_Verify Bank Name field  is available and select bank "ICICI"
		When  TC_015_Verify Branch name field is visible and select data "GURGAON - CYBER GREENS"
		When  TC_016_Verify IFSC Code field is available and autoselet after selecting bank branch "ICIC0000610"
		When  TC_017_Verify MICR Code field is available and autoselet after selecting bank branch "110229072"
		When  TC_018_Account number text box is visible and clickble "31476292911"
		When  TC_019_Re-Account number text box is visible and clickble "31476292911"
		When  TC_020_Verify Saving Account Type  button is visible and clikable
		When  TC_021_Verify Current  Account Type  button is visible and clikable
		When  TC_022_Verify submit button is visible and clickable
    When  TC_023_Verify claimNumber is available on claim intimate iframe
    When  TC_024_Verify  NO button is available on claim intimate iframe and clickable
    When  TC_025_Verify  YES button is available on claim intimate iframe and clickable
    
    @Broker_Claim_Track
     Scenario Outline: Scenario_ID_07 Broker_Claim_TrackTestCases 
     Given User on Homepage page
     When  TC_001_Verify Track Claims   sub module is visible and clickable
     When  TC_002_Verify Searchcriteria drop down is visible and clickable"<searchCriteria_Dropdown>"
     When  TC_003_Verify searchFor field is visible and clickable"<Claim_Number>"
     When  TC_004_Verify  search button is visible and clickable
     When  TC_005_Verify Online_claim_progress_VIEW_link is visible and clickable
     When  TC_006_Verify viewDetail_VIEW_link is successfully open"<Patient_Name>","<Claim_Amount>","<Diagnosis>"
     When  TC_007_Verify View_Claim_Letter_view_Link is visible and clickable
		
	
		 Examples:
     | Patient_Name|Claim_Amount|Diagnosis|Claim_Number|searchCriteria_Dropdown|
     | Jeanbaptiste Bernard Fauchille|0.00|Fever|FGH-2J-17-7000031-00-000|Policy Number|
    
      @Broker_Hospital_Locator
     Scenario Outline: Scenario_ID_08 Broker_Hospital_Locator  TestCases 
     Given User on Homepage page
     When  TC_001_Verify  Hospital Locator link is visible and clickable
     When  TC_002_Verify  search Hospital field is available on Network servicepage and clickable "<hospital_cityname>"
     When  TC_003_Verify  search button is visible and clickable
     Then  Hospital datail is available as searching "<hospital_cityname>"
     Examples:
     | hospital_cityname|
     | Mumbai  |
     
     
   
  
     
      @Broker_MyPolicy_ViewManagePassword
     Scenario Outline: Scenario_ID_12 Broker_My Policy_ViewManagePassword TestCases 
      Given User on Homepage page
     When  TC_001_Verify the View manage password sub module link is available and open
     When  TC_002_Verify client radio button is visible and clickable
     When  TC_003_Verify client name  field is available and clickable"<Client_Name>"
     When  TC_004_Verify client code field is available and clickable"<Client_code>"
     When  TC_005_Verify Search button is visible and clickable
     Then   client name and client code show on page"<Client_Name>","<Client_code>"
     When  TC_006_Verify policy radio button is visible and clickable
     When  TC_007_Verify policy Number  field is visible and clickable"<policy_no>"
     When  TC_005_Verify Search button is visible and clickable
     When  TC_008_Verify Intermediary button is visible and clickable
     When  TC_009_Verify Intermediarycode field is visible and clickable"<IntermediaryCode>" 
     When  TC_010_Verify Intermediaryname field is visible and clickable"<IntermediaryName>" 
     When  TC_005_Verify Search button is visible and clickable
     Then   Intermediarycode and Intermediaryname show on page"<IntermediaryCode>","<IntermediaryName>"
      When  TC_011_Verify Employee button is visible and clickable
      When  TC_012_Verify Employeecode field is visible and clickable"<IntermediaryCode>"
      When  TC_013_Verify Employeename field is visible and clickable"<IntermediaryName>"
      When  TC_005_Verify Search button is visible and clickable
      Then   Employeecode and Employeename show on page"<IntermediaryCode>","<IntermediaryName>"

     
      Examples:
     | Client_Name                  |Client_code|policy_no               |IntermediaryCode|IntermediaryName          |
     |Jeanbaptiste Bernard Fauchille|60016355   |FGH-2J-17-7000031-00-000|  60016355       |Landmark Insurance Brokers Pvt|
     
   