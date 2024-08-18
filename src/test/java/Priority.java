import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
    @BeforeTest
    public void test1(){
        System.out.println("this is test1");
    }
    @Test
    public void test2(){
        Assert.assertTrue(false);
        System.out.println("this is test 2");
    }
    @Test
    public void test3(){
        System.out.println("this is  test 3");
    }
    @Test
    public void test4(){
        System.out.println("this is test4");
    }
}
