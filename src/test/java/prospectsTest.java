import MyListener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Prospect;

@Listeners(Listener.class)
public class prospectsTest {


    @Test
    public void createFolder() {
        new LoginPage()
                .login();

        new Prospect()
                .pressCreateFolderButton()
                .setFolderName()
                .clickCreateButton()
                .checkCreatedFolder();
    }
}
