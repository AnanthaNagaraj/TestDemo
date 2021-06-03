package com.test;

import org.testng.annotations.Test;


public class Sample {

	@Test	
	public void test()
	{
		System.out.println("Hello 123");
	}
	
	
	@Test(groups = {"smoke"})	
	public void tes2()
	{
		System.out.println("Hello 101");
	}
}
