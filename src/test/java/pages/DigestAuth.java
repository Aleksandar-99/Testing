package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DigestAuth extends MainMethods{

    private final By DigestAuthXpath = By.xpath("//h3[text()='Digest Auth']");

    public DigestAuth loginWithPredefinedUsernameAndPassword(){
        getDriver().get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
        test.log(LogStatus.INFO,"Login with Username:admin and Password:admin");
        return this;
    }

    public DigestAuth verifyIfOnTheRightPage(){
        verifyThatElementIsVisible(DigestAuthXpath);
        test.log(LogStatus.INFO,"Digest Auth Title is visible");
        return this;
    }
}
