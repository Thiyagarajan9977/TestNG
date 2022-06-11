package org.cts.test.prog;

import java.util.Date;

import org.cts.test.dataproviders.Datas;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook_Login_Data extends FBLoginPage {

	@BeforeClass
	public void beforeclass() {		
		launchbrowser();
		launchurl("https://www.facebook.com");
		FBLoginPage l = new FBLoginPage();
		click(l.getEnglish());	
		System.out.println("before class");
	}

	@AfterClass
	public void afterclass() {
		quit();
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Test starts.............. " + new Date());
		System.out.println("before method");

	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("Test starts.............. " + new Date());
		System.out.println("After Method");
	}
	
	
	@Test(dataProvider="login", dataProviderClass=Datas.class)
	public void test(String user, String user2) throws InterruptedException {		
		
		//Assert if any test case fail it will terminate the script
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"), "verify login url");
		FBLoginPage l = new FBLoginPage();
							
		// Softassert if any test case fail it will skip the fail test case and run remaining 
		//test case and use assertAll method in last line to capture the failed testcases 
		SoftAssert so = new SoftAssert();
		sendkeys(l.getUsername(), user);
		l.getUsername().clear();
		so.assertEquals("ThiyagarajaN", l.getUsername().getAttribute("value"), "Verify the Username");
		sendkeys(l.getPassword(), user2);
		l.getPassword().clear();
		so.assertEquals("9876543210", l.getPassword().getAttribute("value"), "verify the password");
		click(l.getLoginbutton());
		so.assertAll();
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Done");		
	}
	
	@Test(priority=-1)
	public void Test2() {
		System.out.println("I am the First");
	}
	
}
