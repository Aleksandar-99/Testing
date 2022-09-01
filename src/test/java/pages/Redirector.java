package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Redirector extends MainMethods{

    private final By hereButtonXpath = By.xpath("//a[@id='redirect']");

    public StatusCodes clickOnHereButton(){
        click(hereButtonXpath);
        test.log(LogStatus.INFO,"Here button is clicked");
        return new StatusCodes();
    }
}
