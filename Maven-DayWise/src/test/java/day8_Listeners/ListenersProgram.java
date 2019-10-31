package day8_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersProgram implements ITestListener {

	
	public void onFinish(ITestContext arg0) {					
		System.out.println("I am in Finish" + arg0.getName());			
        		
    }		

		
    public void onStart(ITestContext arg0) {					
    	System.out.println("I am in start" + arg0.getName());			
        		
    }		

		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
    	System.out.println("I am in Failed" + arg0.getName());			
        		
    }		

	
    public void onTestFailure(ITestResult arg0) {					
    	System.out.println("I am in Finish" + arg0.getName());			
        		
    }		

 		
    public void onTestSkipped(ITestResult arg0) {					
    	System.out.println("I am in skipped" + arg0.getName());			
        		
    }		

	
    public void onTestStart(ITestResult arg0) {					
    	System.out.println("I am in teststart" + arg0.getName());			
        		
    }		

 		
    public void onTestSuccess(ITestResult arg0) {					
    	System.out.println("I am in testsuccess" + arg0.getName());		
        		
    }		
}

