import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup1 {

    @Test(groups={"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify login");
    }

    @Test(enabled = false)
    public void verifyCreateNewUser(){
        System.out.println("verify create new user account");
    }

    @Test(dependsOnGroups = {"smoke"},alwaysRun = true)
    public void verifyFundTransfer(){
        System.out.println("verify fund transfer");
    }
}
