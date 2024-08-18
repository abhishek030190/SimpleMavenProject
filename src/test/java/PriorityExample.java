import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 2)
    public void TestDemo1() {
        System.out.println("Testdemo 1");
    }

    @Test(priority = 3)
    public void TestDemo2(){
        System.out.println("Testdemo 2");
    }

    @Test(priority = 4)
    public void TestDemo3()

    {
        System.out.println("Testdemo 3");
    }

    @Test(priority = 1)
    public void TestDemo4()
    {
        System.out.println("Testdemo 4");
    }

}