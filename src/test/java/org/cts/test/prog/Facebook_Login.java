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

public class Facebook_Login extends FBLoginPage {

	@BeforeClass
	public void beforeclass() {		
		launchbrowser();
		System.out.println("Browser Launched - Before Class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
		quit();
		
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
	
	@Parameters({"username", "password"})
	@Test
	public void test(@Optional("Rajan")String user, @Optional("98765")String user2) {		
		launchurl("https://www.facebook.com");
		
		
		//Assert if any test case fail it will terminate the script
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"), "verify login url");
		FBLoginPage l = new FBLoginPage();
		click(l.getEnglish());				
		
		
		// Softassert if any test case fail it will skip the fail test case and run remaining 
		//test case and use assertAll method in last line to capture the failed testcases 
		SoftAssert so = new SoftAssert();
		sendkeys(l.getUsername(), user);
		so.assertEquals("ThiyagarajaN", l.getUsername().getAttribute("value"), "Verify the Username");
		sendkeys(l.getPassword(), user2);
		so.assertEquals("9876543210", l.getPassword().getAttribute("value"), "verify the password");
		click(l.getLoginbutton());
		so.assertAll();
		System.out.println("Done");
		
	}
	
	@Test(priority=-1)
	public void Test2() {
		System.out.println("I am the First");
	}
	
}
