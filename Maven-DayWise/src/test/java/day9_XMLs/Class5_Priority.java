package day9_XMLs;

import org.testng.annotations.Test;


public class Class5_Priority {


	@Test(priority = -1)
	public static void test1()
	{
		System.out.println("I am in 1");
	}

	@Test(priority = 0)
	public static void test2()
	{
		System.out.println("I am in 2");
	}
	
	@Test(priority = -1)
	public static void test3()
	{
		System.out.println("I am in 3");
	}
}
