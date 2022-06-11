package org.cts.suite.level;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	public void B1() {
		Assert.assertTrue(true, "verfiy username");
		System.out.println("Test B1");
	}
	
	@Parameters({"firstname", "lastname"})
	@Test
	public void B2(String firstname, String lastname) {
		Assert.assertTrue(true);
		System.out.println("Test B2");
		System.out.println(firstname);
		System.out.println(lastname);

	}
	
	@Test
	public void B3() {
		Assert.assertTrue(false,"Verify Result...");
		System.out.println("Test B3");

	}
	
}
