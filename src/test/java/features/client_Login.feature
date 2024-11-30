
@Client_Login
Feature: Automation FG portal

 Background: Scenario_ID_01_LoginPage 
    Given user on Login page
    When TC_001 Verify userNamefield "FGH1097852"
    When  TC_002 Verify passwordfield "Password@852"
    When  TC_003 Verify Group radiobutton is clickable
    When  TC_004 Verify Loginbutton is clickable
    Then user on DashBoardpage
     When TC_005 Verify Client Name on MyPolicy Table "Prince Wadhwa"
     When TC_006 Verify Policy No on MyPolicy Table "FGH-10-22-7000989-00-000"
     When TC_007 Verify Profile link avaialbe on MyPolicy Table is clickable
     Then user on Homepage
     
   @Client_changePassword
    Scenario: Scenario_ID_02 Client_ChangePassword TestCases 
    When TC_001 Verify changePassword link is clickable
   When TC_002 Verify oldPassword field "Password@852"
   When TC_003 Verify NewPassword field "Password@852"
    When TC_004 Verify confermPassword field "Password@852"
    When TC_005 Verify submit button 
     Then Successful update password meassage is show
     
      @Client_UpdateMobileNo
    Scenario: Scenario_ID_03 Client_UpdateMobileNo  TestCases 
     Given User on UpdateMobileEmail page
   When TC_001 Verify Mobile No button is clickable
    When TC_002 Verify NewMobile No field "9991119066"
    When TC_003 Verify send OTP button
    When TC_004 Verify enter OTP field "123678"
    When TC_005 Verify Submit button 
    Then Successful update meassage is show
    
    
      @Client_Update_Email_Id
     Scenario: Scenario_ID_04 Client_Update_Email_ID  TestCases 
     Given User on UpdateMobileEmail page
     When  TC_001_Verify  Emailradio button  is selected
		 When  TC_002_Verify newEmail Id  field is available and accept  valid data"prince.wadhwa@eicoretech.com"
     When  TC_003_Verify send OTP button is visible and clickable
     When  TC_004_Verify  Enter OTP  field is available and clickable "123678"
     When  TC_005_Verify  submit button should be visible and clickable
     Then Successful update meassage is show
  
   @Client_Update_Both_Mobile_Email
      Scenario: Scenario_ID_05 Client_Update_Both_MobileEmail_ID  TestCases 
     Given User on UpdateMobileEmail page
     When  TC_001_Verify Both radio button  is selected
     When  TC_002_Verify new Mobile Number  field is visible and  accept data "9991119066"
     When  TC_003_Verify newEmail Id  field is visible and  accept data "prince.wadhwa@eicoretech.com"
     When  TC_004_Verify send OTP button is visible and clickable
     When  TC_005_Verify  Enter OTP field is available and clickable "123678"
     When TC_006_Verify  submit button should be visible and clickable
     Then Successful update meassage is show
     
      @Client_Claim_Request
     Scenario: Scenario_ID_06 Client_Claim_Request  TestCases 
     Given User on Homepage page
    When  TC_001_Verify Claims Request  sub module is visible and clickable
    When  TC_002_Verify  click here for intimation link is visible and clickable
		When  TC_003_Verify Search Hospital Name  field is visible and select hospital "AADHAR"
		When  TC_004_Verify Mobile Number field  is visible and clickable "9991119066"
		When  TC_005_Verify  Email field is visible and clickable "prince.wadhwa@eicoretech.com"
		When  TC_006_Verify Diagnosis field is editable or not "Fever" 
		When  TC_007_Check Date Of Admission is selectable "20-05-2023"
		When  TC_008_Check Date Of Discharge is selectable "20-05-2023"
		When  TC_009_Check Claimed Amount field is visible and clickable "1000"
		When  TC_010_Verify account holder name is available "Prince Wadhwa"
		When  TC_011_Verify Bank Name field  is available and select bank "ICICI"
		When  TC_012_Verify Branch name field is visible and select data "GURGAON - CYBER GREENS"
		When  TC_013_Verify IFSC Code field is available and autoselet after selecting bank branch "ICIC0000610"
		When  TC_014_Verify MICR Code field is available and autoselet after selecting bank branch "110229072"
		When  TC_015_Account number text box is visible and clickble "31476292911"
		When  TC_016_Re-Account number text box is visible and clickble "31476292911"
		When  TC_017_Verify Saving Account Type  button is visible and clikable
		When  TC_018_Verify Current  Account Type  button is visible and clikable
		When  TC_019_Verify submit button is visible and clickable
    When  TC_020_Verify claimNumber is available on claim intimate iframe
    When  TC_021_Verify  NO button is available on claim intimate iframe and clickable
    When  TC_022_Verify  YES button is available on claim intimate iframe and clickable
  
  @Client_Claim_Track
     Scenario Outline: Scenario_ID_07 Client_Claim_TrackTestCases 
     Given User on Homepage page
    When  TC_001_Verify Track Claims  sub module is visible and clickable
		When  TC_002_Verify Online_claim_progress_VIEW_link is available
		When  TC_003_Verify VIEW_detail_view link is available
	When  TC_004_Verify View_Claim_Letter_view_Link is  available
	 When  TC_005_Verify Online_claim_progress_VIEW_link is successfully open
		When  TC_006_Verify VIEW_detail_view link is successfully open "<Patient_Name>","<Claim_Amount>","<Diagnosis>"
	 
		When  TC_007_Verify View_Claim_Letter_view_Link is succesfully open
		
		 Examples:
     | Patient_Name|Claim_Amount|Diagnosis|
     | Prince Wadhwa|0.00|Fever|
     
      @Client_Hospital_Locator
     Scenario Outline: Scenario_ID_08 Client_Hospital_Locator  TestCases 
     Given User on Homepage page
     When  TC_001_Verify  Hospital Locator link is visible and clickable
     When  TC_002_Verify  search Hospital field is available on Network servicepage and clickable "<hospital_cityname>"
     When  TC_003_Verify  search button is visible and clickable
     Then  Hospital datail is available as searching "<hospital_cityname>"
     Examples:
     | hospital_cityname    |
     | Pune   |

     
        @Client_Dependent_Adition
     Scenario Outline: Scenario_ID_09 Client_Dependent__Adition  TestCases 
      Given User on Homepage page
      When  TC_001_Verify Dependent Addition  sub module link is available and clickable
      When  TC_002_Verify relationship dropdown  is available and clickable "<Relationship>"
      When  TC_003_Verify  D.O.B field  is available and clickable"<DOB>"
			
			When  TC_004_Verify Dependent name field  is available and clickable "<Dpendent_Name>"
			
			When  TC_005_Verify  age  field  is available and autofiilled after selecting D.O.B
			When  TC_006_Verify Gender dropdown  is available and clickable "<Gender>"
			When  TC_007_Verify remark  field  is available and clickable"<Remark>"
			When  TC_008_Verify save button is visible and clickable
			When  TC_009_Verify use can delete dependent
			
			 Examples:
     | Relationship|Dpendent_Name|DOB       |Gender|Remark| edit_edit_Relationship   |edit_Dpendent_Name|edit_DOB   |edit_Gender|editRemark|
     | Son         |Atul         |12-03-1996|Male  |    ok| Son                      |Rina              |12-03-1996 |Female     | ok|
   
   
    @Client_Dependent_Parent_Adition
     Scenario Outline: Scenario_ID_10 Client_Dependent_Parent_Adition  TestCases 
      Given User on Homepage page
      When  TC_001_Verify Dependent  parent Addition  sub module link is available and clickable
      
			When  TC_002_Verify relationship dropdown  is available and clickable"<relationship>"
			When  TC_003_Verify  DOB  field  is available and clickable"<DOB>"
			When  TC_004_Verify Dependent Name field  is available and clickable"<DependentName>"
			When  TC_005_Verify  age  field  is available and autofiilled after selecting DOB
			When  TC_006_Verify Gender dropdown  is available and clickable"Gender"
			When  TC_007_Verify  Sum Insured dropdown is available and clickable"<SumeInsured>"
			When  TC_008_Verify premium for dropdown is visible and clickable"<Premium_For>"
			When  TC_009_Verify  G.S.T field  is visible  and show data after selecting premium for dropdown"<GST>"
			When  TC_010_Verify  parent premium Field is visible and auto show data after selecting premium for  dropdown"<parent_premium>"
			When  TC_011_Verify  final premium Field is visible and auto show data after selecting premium for  dropdown"<final_premium>"
			When  TC_012_Verify remark  field  is available and clickable "<Remark>"
			When  TC_013_Verify save button is visible and clickable
      When  TC_014_Verify user can delete added dependent parent detail 
			 Examples:
     | relationship|DependentName|DOB       |Gender|Remark|SumeInsured|Premium_For|GST|parent_premium|final_premium|Remark|
     | Father      |Atul         |12-03-1996|Male  |    ok| 300000    |Two Parent| 180  |    1000    |     1180    |ok|
     
      @Client_MyPolicy_Detail
     Scenario Outline: Scenario_ID_11 Client_MyPolicy_Detail  TestCases 
      Given User on Homepage page
      When  TC_001_Verify My Policy detail module is visible and clickable
      When  TC_002_Verify the expected Client Code availale on page"<Client_Code>"
      When  TC_003_Verify the expected Client Name availale on page"<Client_Name>"
      When  TC_004_Verify the expected Policy  No availale on page "<Policy_No>"
      When  TC_005_To check weather Profile link is clickable and successfully open"<Client_Name>","<Client_Code>","<Email>","<Mobile_No>"
      When  TC_006_To check weather  Health Card link is clickable and  successfully open "<Client_Name>","<Policy_No>","<insured_name>"
      When  TC_007_To check weather Member details  View link is clickable and  successfully open"<Policy_No>"
       
       Examples:
     | Client_Code |Client_Name  |Policy_No               |Email                       |Mobile_No|insured_name|
     | FGH100212951|Prince Wadhwa|FGH-10-22-7000989-00-000|prince.wadhwa@eicoretech.com|9991119066|Others Eicore Technologies Pvt. Ltd.|
     
         @Client_My_Policy_Benefit
     Scenario Outline: Scenario_ID_12 Client_My_Policy_Benefit  TestCases 
      Given User on Homepage page
     When  TC_001_To check weather My Policy Benefit link available and clickable
     When  TC_002_Verify the policy Number available on page"<Policy_No>"
     
      Examples:
     | Policy_No    |
     |FGH-10-22-7000989-00-000  |
     
        @Client_NEFT
     Scenario Outline: Scenario_ID_13 Client_NEFT  TestCases 
      Given User on Homepage page
      When  TC_001_Verify NEFT  sub module is visible and clickable
			When  TC_002_Verify account holder name is available"<Acc_Holdername>"
			When  TC_003_Verify IFSC Code field is available and clickable"<IFSC>"
			When TC_011_Verify Current  Account Type  button is visible and clikable
			When  TC_012_Verify check box is visible and clickable
			When  TC_004_Verify Branch name field  is available and auto desplay bankname after selecting IFSC code"<Branch_Name>"
			When  TC_005_Verify Bank Name field  is available and auto desplay bankname after selecting IFSC code"<BankName>"
			When  TC_006_Verify MICR Code field is available and autoselect after selecting IFSC code"<MICR>"
			When  TC_007_Verify Bank Address field is available and autoselect after selecting IFSC"<Bank_Adrees>"
			When  TC_008_Account number text box is visible and clickble"<Account_number>"
			When  TC_009_Re-Account number text box is visible and clickble"<Account_number>"
			When  TC_010_Verify Saving Account Type  button is visible and clikable
      When  TC_013_Verify submit button is visible and clickable
			
			   Examples:
     | Acc_Holdername |IFSC       |BankName            |Branch_Name            |MICR      |Bank_Adrees|Account_number|
     | Prince Wadhwa  |ICIC0000610|ICICI BANK LTD      |GURGAON - CYBER GREENS|110229072 |           |   31476292911        |              
     
     
      @Client_Parent_In_Law_Adition
     Scenario Outline: Scenario_ID_14 Client_Dependent_Parent_Adition  TestCases 
      Given User on Homepage page
      When  TC_001_Verify Parent In Law Addition  sub module link is available and clickable
      
			When  TC_002_Verify Relationship dropdown  is available and clickable"<relationship>"
			When  TC_003_Verify  DOBfield  is available and clickable"<DOB>"
			When  TC_004_Verify DependentName field  is available and clickable"<DependentName>"
			When  TC_005_Verify  age  field  is available and autofilled after selecting DOB
			When  TC_006_Verify gender dropdown  is available and clickable"<Gender>"
			When  TC_007_Verify  SumInsured dropdown is available and clickable"<SumeInsured>"
			When  TC_008_Verify Remark  field  is available and clickable "<Remark>"
			When  TC_009_Verify Save button is visible and clickable
      When  TC_010_Verify calculate premium button is visible and clickable
      When  TC_011_Verify Premium field show correct value"<Premium>"
      When  TC_012_Verify GST field show correct value"<GST>"
      When  TC_013_Verify TotalPremium field show correct value"<Total_premium>"
      When  TC_014_Verify user can delete addeddependent parent detail
			 Examples:
     | relationship|DependentName|DOB       |Gender|Remark|SumeInsured|Premium|GST|Total_premium|
     | Father      |  MIRA      |12-03-1996|Male  |    ok| 500000    |10000| 1800  |    11800    |   