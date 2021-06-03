package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {

	@Parameters({"URL"})
	@BeforeMethod
	public void test(String url)
	{
		System.out.println("Launching URL from browser");
		System.out.println("Launching URL --->" +url);
		
	}
}
