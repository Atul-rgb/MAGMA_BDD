package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


import POM.LoginPage;
import POM.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class LoginPageStepDefination  {
	WebElement changePassword_link;
	WebDriver driver;
	TestContextSetup testContextSetup;
	public LoginPage  loginPage;
	PageObjectManager pageObjectManager;
	SoftAssert softassert;
	 

	public LoginPageStepDefination(TestContextSetup testContextSetup) {
		 this.testContextSetup=testContextSetup;
		 loginPage=testContextSetup.pageObjectManager.openLoginPage();
			 softassert=new SoftAssert();
	}
	@Given("user on login page")
	public void user_on_login_page() throws Exception {
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
		System.out.println("============================================"+currentutl);
	boolean b= 	currentutl.contains("HB_MHDI");
	softassert.assertEquals(b, true);
	softassert.assertAll();
	}
	 
	 
	@When("Enter userName {string}")
	public void Verifyr_username_field(String username) {
	 
		
	loginPage.setUserName(username);
	}
	 
	@When("Enter password {string}")
	public void Verifyr_username_fieldd(String password) 
	{
		loginPage.setPassWord(password);
	}
	 
	 
	@When("click on Loginbutton")
	public void click_on_login_button() throws InterruptedException {
	//Thread.sleep(20000);
		loginPage.click_Login_Button();
	 
	}
	 
	@Then("user on Homepage")
	public void user_go_to_Homepage() throws Exception {
		Thread.sleep(3000);
		String currentutl=testContextSetup.base.lounchBrowser().getCurrentUrl();
	   System.out.println(currentutl);
	boolean b=  currentutl.contains("LoginScreen");
	//softAssert=new SoftAssert();
	softassert.assertEquals(b, true);
	softassert.assertAll();
	 
	}
	
	/*@When("IN_SCN_{int}_TC_1Verify that the Add New button is clickable")
	public void in_scn__tc_1verify_that_the_add_new_button_is_clickable(Integer int1) {
		loginPage.click_inward_generate();
	}*/

}
