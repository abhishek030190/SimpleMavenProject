import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify login");
    }

    @Test
    public void verifyCreateNewUser(){
        System.out.println("verify create new user account");
    }

    @Test
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }

}
