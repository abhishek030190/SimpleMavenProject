import org.testng.annotations.Test;

public class InvocationCountExample {


@Test(invocationCount = 10)
public void MethodForRepitation(){
    System.out.println("Hello World.......");
}

}
