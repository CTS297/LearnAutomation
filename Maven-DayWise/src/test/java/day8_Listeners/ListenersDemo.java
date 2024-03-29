package day8_Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day8_Listeners.ListenersProgram.class)
public class ListenersDemo {
	
	@Test
	public void test1()
	{
		System.out.println("I am in test 1");
	}

	@Test
	public void test2()
	{
		System.out.println("I am in test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("I am in test 3");
		throw new SkipException("Skipped");
	}
}
