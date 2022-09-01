package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class StatusCodes extends MainMethods{

    private final By hereButtonXpath = By.xpath("//div[@id='content']/div/h3");

    public StatusCodes verifyIfRedirectPageIsVisible(){
        verifyThatElementIsVisible(hereButtonXpath);
        test.log(LogStatus.INFO,"Redirected Page is visible");
        return this;
    }
}
