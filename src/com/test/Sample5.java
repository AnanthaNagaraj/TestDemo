package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample5 {

	@Test(priority = 2)
	public void Sample1() {
		System.out.println("Test1");
	}

	@Test(dependsOnMethods = {"Sample1"})
	public void Sample2() {
		System.out.println("Test2");
	}

	@Parameters({"URL"})
	@Test(priority = 2)
	public void Sample3(String str) {
		System.out.println("Test3");
		System.out.println("------>"+str);
		
	}

	@Parameters({"URL"})
	@Test(dependsOnMethods = { "Sample1", "Sample3" }, priority = 1, enabled = true, groups = {"sanity"})
	public void Sample4(String str) {
		System.out.println("Test4");
		System.out.println("------>"+str);
	}

}
