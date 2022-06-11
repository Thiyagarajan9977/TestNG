package org.cts.test.testNG;

import org.testng.annotations.*;

public class Sample {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Beforesuite");
	}
	
	@AfterSuite
	public void aftersuite() {
	System.out.println("after suite");
	}
	
	@BeforeGroups
	public void beforegroup() {
		System.out.println("before group");

	}
	
	@AfterGroups
	public  void aftergroup() {
		System.out.println("after group");
	}
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");

	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test");

	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemthod");

	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");

	}
	
	// To run the particular test number of counts - (invocationCount=2)
	
	@Test(invocationCount=2)
	public void test() {
		System.out.println("i am the first Test");			
	}

	// To set the priority of the test - (priority=-1)
	
	@Test(priority=-1)
	public void test1() {
		System.out.println("i am the ealier than 1st Test");	
	}
	
	// To skip the particular test - (enabled=false)
	
	@Test(enabled=false)
	public void test2() {
		System.out.println("i am the ealier than 1st Test");	
	}
	
	@Test(priority=10)
	public void test0() {
		System.out.println("i think i am the last than 1st Test");	
	}
	

}
