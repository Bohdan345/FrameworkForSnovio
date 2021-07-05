import MyListener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;
import static utils.DataFromProperty.USER_LOGIN;
import static utils.DataFromProperty.USER_PASSWORD;

@Listeners({Listener.class})
public class loginPageTest {

    @Test
    public void logInTest() {
        LoginPage loginPage = new LoginPage()
                .loginTest(USER_LOGIN, USER_PASSWORD);
        assertTrue(loginPage.checkLogIn());

    }

    @Test
    public void logIn() {
        LoginPage loginPage = new LoginPage()
                .login();
        assertTrue(loginPage.checkLogIn());
    }


}