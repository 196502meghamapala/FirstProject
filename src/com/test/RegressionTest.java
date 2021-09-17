package com.test;

import org.junit.Test;
import org.testng.Assert;

public class RegressionTest extends BaseTest{
	
	@Test
	public void targetTitleTest() {
		String actualtitle=driver.getTitle();
		System.out.println("Page Title is ==> "+actualtitle);
		String expectedtitle="Target : Expect More. Pay Less.";
		Assert.assertEquals(actualtitle, expectedtitle);
		Assert.assertTrue(actualtitle.contains("Target : Expect More. Pay Less."));
		System.out.println("Test completed : Title Verified");
	}

}
