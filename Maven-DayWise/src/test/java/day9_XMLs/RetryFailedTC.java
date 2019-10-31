package day9_XMLs;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RetryFailedTC {
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
		int i=0/1;
	}
	@Test(retryAnalyzer = day8_Listeners.MyRetry.class)
	public static void test7()
	{
		System.out.println("I am in 1");
	Assert.assertTrue(1<0);
	}
	@Test
	public static void test8()
	{
		System.out.println("I am in 1");
	}
//	java -classpath testng.jar;%CLASSPATH% org.testng.TestNG -d test-outputs testng.xml
//	java -classpath testng.jar;%CLASSPATH% org.testng.TestNG -d test-outputs test-outputs\testng-failed.xml

}
