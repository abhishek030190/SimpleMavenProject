import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class ExecutionOfFailTestCase implements IRetryAnalyzer {


    private int retrycount=0;

    private static final int maxRetrycount=3;
    @Override
    public boolean retry(ITestResult iTestResult){
        if(retrycount< maxRetrycount){
            retrycount++;
            return true;
        }
        return false;
    }
}
