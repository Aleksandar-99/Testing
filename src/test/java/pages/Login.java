package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Login extends MainMethods {

    private final By usernameInputXpath = By.xpath("//input[@id='username']");
    private final By passwordInputXpath = By.xpath("//input[@id='password']");
    private final By loginButtonXpath = By.xpath("//form[@id='login']/button/i");
    private final By loginPageHeader = By.xpath("//div[@id='content']/div/h2");

    public Login typeUsernameIntoInputField(){
        type(usernameInputXpath, "tomsmith");
        test.log(LogStatus.INFO,"Username is typed");
        return this;
    }

    public Login typePasswordIntoInputField(){
        type(passwordInputXpath, "SuperSecretPassword!");
        test.log(LogStatus.INFO,"Password is typed");
        return this;
    }

    public Secure clickOnLoginButton(){
        click(loginButtonXpath);
        test.log(LogStatus.INFO,"Login Button is clicked");
        return new Secure();
    }

    public Login verifyIfOnLoginPage(){
        verifyThatElementIsVisible(loginPageHeader);
        test.log(LogStatus.INFO,"Login Page is visible");
        return this;
    }
}
