package MyListener;

import initialDriver.InitDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends InitDriver implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + "'"+result.getName()+"'"+"- Success");
        InitDriver.getInstance().destroy();


    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test " + "'"+result.getName()+"'"+" start");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test " + "'"+result.getName()+"'"+"- Skipped");
    }



    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test " + "'"+result.getName()+"'"+"- Failure");
        InitDriver.getInstance().destroy();
    }
}
