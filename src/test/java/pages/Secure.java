package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Secure extends MainMethods  {

    private final By logoutButtonXpath = By.xpath("//div[@id='content']/div/a/i");

    public Secure verifyIfLoginSuccessfully(){
        verifyThatElementIsVisible(logoutButtonXpath);
        test.log(LogStatus.INFO,"Login Successfull and Logout Button is visible");
        return this;
    }

    public Login clickOnLogout(){
        click(logoutButtonXpath);
        test.log(LogStatus.INFO,"Logout is clicked");
        return new Login();
    }
}
