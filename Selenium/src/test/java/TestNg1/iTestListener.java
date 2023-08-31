package TestNg1;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class iTestListener extends BaseTest implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
	}
}
