package org.cts.test.dataproviders;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataUsingExcel extends DemoPage {
	
	WebDriver driver;
	
	@BeforeMethod
	private void setup() {
		launchbrowser();
		launchurl("http://demo.automationtesting.in/Index.html");
	}
	
	@AfterMethod
	private void closemybrowser() {
		System.out.println("Done");
		quit();
	}
	
	
	@DataProvider
	public void getTestData() {
		

	}
	
	
	
	@Test
	private void insidepages(String email, String first,String last, 
			String address,String emailid, String phone, String password ) {
		DemoPage dp = new DemoPage();
		
		dp.getEmail().clear();
		dp.getEmail().sendKeys(email);
		
		dp.getFirstname().clear();
		dp.getFirstname().sendKeys(first);
		
		dp.getLastname().clear();
		dp.getLastname().sendKeys(last);
		
		dp.getAddress().clear();
		dp.getAddress().sendKeys(address);
		
		dp.getEmailid().clear();
		dp.getEmailid().sendKeys(emailid);
		
		dp.getPhone().clear();
		dp.getPhone().sendKeys(phone);
		
		dp.getPassword().clear();
		dp.getPassword().sendKeys(password);
		
	}

}
