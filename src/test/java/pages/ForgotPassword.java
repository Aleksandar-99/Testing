package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class ForgotPassword extends MainMethods {

    private final By emailInputFieldXpath = By.xpath("//input[@id='email']");
    private final By retrievePasswordXpath = By.xpath("//button[@id='form_submit']");

    public ForgotPassword typeEmailIntoInputField(){
        type(emailInputFieldXpath, "testemail@gmail.com");
        test.log(LogStatus.INFO,"Email is typed");
        return this;
    }

    public ForgotPassword clickOnRetrievePasswordButton(){
        click(retrievePasswordXpath);
        test.log(LogStatus.INFO,"Retrieve Password Button is clicked");
        return this;
    }
}
