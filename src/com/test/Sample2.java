package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Sample2 {

	@Test	
	public void test()
	{
		System.out.println("Sample-2 --Test case 1");
	}
	
	
	@Test(groups = {"smoke1","regression"})	
	public void test2()
	{
		System.out.println("Sample-2 --Test case 2");
	}
	
	@Test	
	public void test3()
	{
		System.out.println("Sample-2 --Test case 3");
	}
	
	@BeforeTest	
	public void preCondition()
	{
		System.out.println("---------------Cleaning Up the DB---------------");
	}
	
	@AfterTest	
	public void postCondition()
	{
		System.out.println("---------------- Cleaning Data ------------------");
	}
	
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("--- Login ---");
	}
	
	@AfterMethod
	public void LogOut()
	{
		System.out.println("--- LoginOut ---");
	}
	
	
	@BeforeClass
	public void sa()
	{
		System.out.println("Uploading Data for Sample2 class");
	}
	
	
	@AfterClass
	public void sa1()
	{
		System.out.println("removing Data for Sample2 class");
	}
}
