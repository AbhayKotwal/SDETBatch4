package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer  {
	
	   private int count1;
	    private static final int retryCountMax=3;

	 
	    public boolean retry(ITestResult result) {
	        
	        if (count1 <retryCountMax) {
	          count1++;
	          return true;
	        }
	        return false;
	        
	    }

}
