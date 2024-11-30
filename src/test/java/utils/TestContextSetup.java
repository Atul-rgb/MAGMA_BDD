package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import POM.PageObjectManager;


public class TestContextSetup {

	public WebDriver driver;
	
	public PageObjectManager pageObjectManager;
    public Base base;
    public GenericUtils genericUtils;
    
	
	public TestContextSetup() throws Exception
	{  //from this we supply driver to all framework  by creating object of this class
	     base=new Base();
	     // we need driver in PageObjectManager for every class object
		pageObjectManager=new PageObjectManager(base.lounchBrowser());
		genericUtils=new GenericUtils(base.lounchBrowser());
	}
	
}
