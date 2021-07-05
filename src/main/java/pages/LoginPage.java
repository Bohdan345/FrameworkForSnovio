package pages;

import org.openqa.selenium.By;
import seleniumElements.Button;
import seleniumElements.Elements;
import seleniumElements.Fields;
import seleniumElements.Windows;

import static utils.DataFromProperty.*;

public class LoginPage {

    /**
     * Elements Locators
     **/
    private static final By signInWithGoogle = By.xpath("//a[@class='google-sign-up google-register']");
    private static final By loginField = By.xpath("//input[@id='email']");
    private static final By passwordField = By.xpath("//input[@id='password']");
    private static final By loginButton = By.xpath("//button[@id='buttonFormLogin']");
    private static final By rememberMeCheckBox = By.xpath("//input[@id='remember']");
    private static final By forgotPasswordLink = By.xpath("//a[text()='Forgot Your Password?']");
    private static final By loginHeaderText = By.xpath("//h3[text()='Log In to your account']");
    private static final By listsText = By.xpath("//div[text()='Lists']");


    Button button = new Button();
    Fields fields = new Fields();
    Elements elements = new Elements();
    Windows windows = new Windows();

    public void goToBaseURl() {
        windows.navigate(URL);

    }


    private LoginPage typeLogin() {
        fields.typeField(loginField, USER_LOGIN);
        return this;
    }

    private LoginPage typePassword() {
        fields.typeField(passwordField, USER_PASSWORD);
        return this;
    }

    private LoginPage setLogin(String login) {
        fields.typeField(loginField, login);
        return this;
    }

    private LoginPage setPassword(String password) {
        fields.typeField(passwordField, password);
        return this;
    }

    private void pressLoginButton() {
        button.click(loginButton);

    }

    public boolean checkLogIn() {

        return elements.waitTextToBe(listsText, "Lists");
    }


    // тест для проврки логина
    public LoginPage loginTest(String login, String password) {
        goToBaseURl();
        setLogin(login);
        setPassword(password);
        pressLoginButton();

        return this;
    }

    // метод логирования
    public LoginPage login() {
        goToBaseURl();
        typeLogin();
        typePassword();
        pressLoginButton();

        return this;

    }


}
