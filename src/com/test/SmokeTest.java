package com.test;

import org.junit.Test;

import teststeps.CoreSteps;

public class SmokeTest extends BaseTest{
	
	@Test
	public void test1() throws Exception {
		CoreSteps c=new CoreSteps(driver);
		c.verifyHomePageLogo();
		Thread.sleep(2000);
		c.clickCategoriesLink();
		Thread.sleep(2000);
		c.clickDealLink();
		Thread.sleep(2000);
		c.clickNewArrivalLink();
		Thread.sleep(2000);
		c.clickOrderPickupandDelivery();
		Thread.sleep(2000);

		
	
	
	}

}
