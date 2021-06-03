package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample3 {

	@Test	
	public void WebLoginCar()
	{
		System.out.println("WebLoginCar");
	}
	
	
	@Test	
	public void MobilLogin_Test1()
	{
		System.out.println("MobilLogin11111");
		
	}
	
	@Test	
	public void MobilLogin_Test2()
	{
		System.out.println("MobilLogin11111");
		
	}
	
	@Test(groups = {"smoke"})	
	public void MobilLogin_Test3()
	{
		System.out.println("MobilLogin11111");
		
	}
	
	@Test	
	public void MobilLogin_Test4()
	{
		System.out.println("MobilLogin11111");
		
	}
	
	@Test	
	public void APILogin()
	{
		System.out.println("APILogin");
	}
	
	@BeforeTest
	public void preCond1()
	{
		System.out.println("-------------Adding API Data ---------------------");
	}
	
	@AfterTest
	public void postCond1()
	{
		System.out.println("-------------Cleaning API Data ---------------------");
	}
	
}
