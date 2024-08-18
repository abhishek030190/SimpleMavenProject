import org.testng.annotations.Test;

public class InvocationCountexample1 {
    @Test(invocationCount = 10000,invocationTimeOut = 1)
    public void MethodofInvocation(){
        System.out.println("Hello everyone..................");
    }
}
