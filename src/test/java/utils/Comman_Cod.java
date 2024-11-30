package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Comman_Cod {
    WebDriver  ldriver;
	WebDriverWait wait;
	Select select;
	
	JavascriptExecutor executor;
	public Comman_Cod(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	
	public  void shitch_to_Iframe(WebElement element)
	{
		ldriver.switchTo().frame(element);
	}
	public  void shitch_to_Parent()
	{
		ldriver.switchTo().defaultContent();
	}
	public  void javascript_click_specific_element(WebElement element)
	{  JavascriptExecutor js = (JavascriptExecutor) ldriver;
    js.executeScript("arguments[0].scrollIntoView(true);", element);
		 executor = (JavascriptExecutor) ldriver;
	    executor.executeScript("arguments[0].click();", element);
	}
	public void accept_alert() {
		ldriver.switchTo().alert().accept();
	}
	public  void javascript_to_scroll_specific_element(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void waitLoader() throws Exception {

		//=================================================================================
		By loader = By.xpath("//div[contains(@ng-show,'loaderDiv == true') and contains(@aria-hidden,'false')]");
		
		By loadingImage = By.id("loaderDivL");
		
		for(int i=0;i<60;i++)
		{
			boolean loadercheck = false;
			
			try {
				
				Thread.sleep(1000);
				loadercheck = ldriver.findElement(loader).isEnabled();
				
			} catch (org.openqa.selenium.NoSuchElementException e) {
				//e.printStackTrace();
				if(i>=60){
					
					System.out.println("website too slow to response, check internet speed or code");
					
				}else{
					
					System.out.println("page loaded in exception....");	
				}
				
				//loadercheck = false;
			}catch(Exception e)
			{
				System.out.println("Thread Exception");
			}
			
			
			if(loadercheck == true)
			{
				System.out.println("Page Loading....");
				
			}
			else
			{
				System.out.println("Page Loaded cause no Loader.....");
				//Thread.sleep(5000l);
				break;
			}
			
		}
}}
