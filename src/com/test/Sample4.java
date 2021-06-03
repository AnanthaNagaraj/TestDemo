package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Sample4 {

	@Test(groups = {"smoke"})	
	public void test()
	{
		System.out.println(" Sample4 Hello");
	}
	
	
	@Test	
	public void tes2()
	{
		System.out.println("Sample4 Hello1");
	}
	
	
	@BeforeSuite
	public void initalization()
	{
		System.out.println(" ========= Before Suite get execution ======== ");
	}
	
	@AfterSuite
	public void End()
	{
		System.out.println("-----XXXXXXXXXX----");
	}
}
