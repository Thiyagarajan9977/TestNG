package org.cts.suite.level;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ClassA {

	@Parameters({"firstname", "lastname"})
	@Test
	public void A1(String user, String user2) {
		Assert.assertTrue(true);
		System.out.println("Test A1");
		System.out.println(user+ " "+user2);
	}

	@Test
	public void A2() {
		Assert.assertTrue(true, "verify the URL");		
		System.out.println("Test A2");
	}

	
	@Test	
	public void A3() {
		System.out.println("Test A3");
		Assert.assertTrue(false);
	}
}
