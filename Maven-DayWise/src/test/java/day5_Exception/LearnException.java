package day5_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int[] numbers= {1,2,3};
		System.out.println(numbers[10]);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
			System.out.println(e.getStackTrace());
		}
		finally
		{
			System.out.println("I am insode finally");
		}
		
		throwexception(12);
		throwexception(21);
		
		try {
			throwssss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void throwexception(int age)
	{
		//ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException
		if (age<18)
			throw new ArithmeticException("You are too young");
		else
			System.out.println("You are eligible");
	}

	
	public static boolean elementpresent(WebDriver driver)
	{
		try
		{
			driver.findElement(By.id("asdasd"));
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public static void throwssss() throws Exception
	{
		System.out.println("this is example of throws");
	}
	
}
