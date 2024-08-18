import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example2Testng {

    @BeforeTest
    public void A(){
        System.out.println("A");
    }
    @Test
    public void B(){
        System.out.println("B");
    }

    @Test
public void C(){

        System.out.println("C");
    }
    @AfterTest
    public void X(){
        System.out.println("X");
    }

}
