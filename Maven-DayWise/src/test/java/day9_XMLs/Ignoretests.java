package day9_XMLs;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore //ignore class
public class Ignoretests {
	@Test
	public static void test4()
	{
		System.out.println("I am in 1");
	}

	@Ignore //ignore test
	@Test
	public static void test5()
	{
		System.out.println("I am in 2");
	}
	
	@Test
	public static void test6()
	{
		System.out.println("I am in 3");
	}
	@Test
	public static void test7()
	{
		System.out.println("I am in 1");
	}
	@Test
	public static void test8()
	{
		System.out.println("I am in 1");
	}
}

//to ignore package, rightclick on src/java folder and create a package with same name as the package you want to ignore. It creates package-info .java 