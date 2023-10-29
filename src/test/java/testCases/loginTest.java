package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class loginTest extends CommonMethods {
    /*
    testcase 1:
    login into the application
    verifty the message Welcome Admin
     */
    @Test
    public void loginTest(){
       sendText(login.usernameBox,"Admin");
       sendText(login.passwordBox,"Hum@nhrm123");
       click(login.loginBtn);
       //verify message
     String  actualMessage =dash.welcomeMessage.getText();
     //verification
        Assert.assertEquals(actualMessage, "Welcome Admin");
    }
}
