package com.shopping.framework.pages.women.tops;



import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class TopsPage {
	
			
	@FindBy(xpath="//a[text()='Women' and @class='sf-with-ul']")
	private WebElement Women_tab;
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	private WebElement Sort_DD;
	
	
	public void clickOnWomenTab() {
	Women_tab.click();
	}
	
	public void verifyValuesOfSortDropDown() {
		int count=0;
		Select dd_select=new Select(Sort_DD);
		List<WebElement> sortDD_actual=dd_select.getOptions();
		String[] dropdown_expected= {"Price: Lowest first","Price: Highest first","Product Name: A to Z","Product Name: Z to A","In stock","Reference: Lowest first","Reference: Highest first"};
		
		for(WebElement we:sortDD_actual ) {
			for(int i=0;i<dropdown_expected.length;i++) {
				
				if(we.getText().equals(dropdown_expected[i])) {
					count++;
				}
				
			}			
			
		}
//		if (count==dropdown_expected.length) {
//			System.out.println("Dropdown Matched");
//		}
				Assert.assertTrue(count==dropdown_expected.length);
				System.out.println("Dropdown values matched: Testcase passed");
		
	}
	
}
