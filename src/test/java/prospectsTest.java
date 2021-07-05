import org.junit.Test;
import pages.LoginPage;
import pages.Prospect;

public class prospectsTest {


    @Test
    public void createFolder() {
        new LoginPage()
                .login();

        new Prospect()
                .pressCreateFolderButton()
                .setFolderName();
        // .clickCreateButton()


    }
}
