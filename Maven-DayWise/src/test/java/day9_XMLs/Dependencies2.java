package day9_XMLs;

import org.testng.annotations.Test;

public class Dependencies2 {
	
	@Test(dependsOnMethods = {"test8"}, priority = 0)
	public static void test4()
	{
		System.out.println("I am in 1");
	}

	@Test(dependsOnGroups = "Sanity.*",groups = "Windows.Regression",priority = 1)
	public static void test5()
	{
		System.out.println("I am in 2");
	}
	
	@Test(groups = "linux.Regression",priority = 2)
	public static void test6()
	{
		System.out.println("I am in 3");
	}
	@Test(groups = "Sanity1")
	public static void test7()
	{
		System.out.println("I am in 1");
	}
	@Test(groups = "Sanity2")
	public static void test8()
	{
		System.out.println("I am in 1");
	}
}
