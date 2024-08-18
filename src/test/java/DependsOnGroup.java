import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
    @Test(groups={"Abhishek"})
    public void verifyLogin(){
        //Assert.assertTrue(false);
        System.out.println("verify login");
    }

    @Test
    public void verifyCreateNewUser(){
        System.out.println("verify create new user account");
    }

    @Test(groups = {"Abhishek"})
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }

    @Test
    public void forgotPassword(){
        System.out.println("forgotpassword......");
    }
    @Test(groups={"Abhishek"})
    public void UserAccount(){
        System.out.println("userAccount....");
    }
}
