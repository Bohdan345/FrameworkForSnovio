package MyListener;

import initialDriver.InitDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends InitDriver implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success  " + result.getName());
        InitDriver.getInstance().destroy();


    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test start  " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped  " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test start " + context.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }
}
