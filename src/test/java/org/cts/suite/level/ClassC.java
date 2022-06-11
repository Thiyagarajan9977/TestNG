package org.cts.suite.level;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {
	
	@Test
	public void C1() {
		Assert.assertTrue(false, "verify Password");
		System.out.println("Test C1");
	}
	
	@Parameters({"firstname", "lastname"})
	@Test
	public void C2(String user, String user2) {
		System.out.println("Test C2");
		System.out.println(user);
		System.out.println(user2);
		
	}
	
	@Test
	public void C3() {
		System.out.println("Test C3");
	}
}
