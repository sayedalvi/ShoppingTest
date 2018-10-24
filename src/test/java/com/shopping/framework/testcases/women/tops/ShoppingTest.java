package com.shopping.framework.testcases.women.tops;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.shopping.framework.pages.women.tops.TopsPage;
import com.shopping.framework.utility.LaunchApplication;

//Test comment to check GIT abc


public class ShoppingTest{
	
	
	
	@Test
	public void verifySortDropDownItems(){	
		WebDriver driver=LaunchApplication.launch_App();
		TopsPage topPage=PageFactory.initElements(driver, TopsPage.class);		
		topPage.clickOnWomenTab();
		topPage.verifyValuesOfSortDropDown();
		
	}
	
	
	
}