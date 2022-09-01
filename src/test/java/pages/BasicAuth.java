package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class BasicAuth extends MainMethods {

    private final By BasicAuthXpath = By.xpath("//h3[text()='Basic Auth']");

    public BasicAuth loginWithPredefinedUsernameAndPassword(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        test.log(LogStatus.INFO,"[Login] with Username:admin and Password:admin");
        return this;
    }

    public BasicAuth verifyIfOnTheRightPage(){
        verifyThatElementIsVisible(BasicAuthXpath);
        test.log(LogStatus.INFO,"[Basic Auth Title] is visible");
        return this;
    }
}
