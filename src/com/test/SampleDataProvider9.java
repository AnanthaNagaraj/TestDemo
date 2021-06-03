package com.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleDataProvider9 extends Base{
 
	// Base class value is retrieving data from the xml so we can run the 
	// 
	
	@Test()
	public void test2()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test(dataProvider = "getData")
	public void test(String un, String pwd)
	{
		System.out.println("-- Sample 9 -- ");
		System.out.println("User name : " +un);
		System.out.println("User pass : " +pwd);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 3---> rows 
		// 2---> columns
		
		Object[][] data = new  Object[3][2];
		
		data[0][0] = "firstName";
		data[0][1] = "pwd";
		
		data[1][0] = "SecondName";
		data[1][1] = "pwd";
		
		data[2][0] = "ThirdName";
		data[2][1] = "pwd";
		
		return data;
	}
}
