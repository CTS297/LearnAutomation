package day9_XMLs;

import org.testng.annotations.Test;

public class Dependencies {
	
	@Test(dependsOnMethods = {"test3", "test2"}, priority = 0)
	public static void test4()
	{
		System.out.println("I am in 1");
	}

	@Test(priority = 1)
	public static void test5()
	{
		System.out.println("I am in 2");
	}
	
	@Test(priority = 2)
	public static void test6()
	{
		System.out.println("I am in 3");
	}
}
