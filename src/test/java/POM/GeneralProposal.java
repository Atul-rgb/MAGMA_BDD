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

public class GeneralProposal {
	
	WebDriver ldriver;
	WebDriverWait wait;
	Comman_Cod comman_Cod;
	Select select;
	public GeneralProposal(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		comman_Cod=new Comman_Cod(ldriver);
	}
	@FindBy (id="ctl00_PageBodyControls_ddlPolicyVariant")
	@CacheLookup
	 WebElement policy_varient;
	@FindBy (id="ctl00_PageBodyControls_ddlInsuredPersonRelation")
	@CacheLookup
	 WebElement insured_person_relationship;
	
	
	
	public  void select_policy_variant(String str) 
	{ select =new Select(policy_varient);
	 select.selectByVisibleText(str);
	
	}
	public  void select_insured_person_relationship(String str) 
	{ select =new Select(insured_person_relationship);
	 select.selectByVisibleText(str);
	
	}
	
 
/*public void clickProfile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(profileLink)).click();
	}*/
	
	/*public void clickLogOut()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logoutlink)).click();
	}*/
	
}
