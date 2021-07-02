import org.junit.Test;
import pages.LoginPage;

import static utils.DataFromProperty.USER_LOGIN;
import static utils.DataFromProperty.USER_PASSWORD;

public class loginPageTest {


    @Test
    public void logInTest() {
        new LoginPage()
                .loginTest(USER_LOGIN, USER_PASSWORD);

    }
}
