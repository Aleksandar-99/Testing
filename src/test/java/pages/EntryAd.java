package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class EntryAd extends MainMethods {

    private final By modalCloseDivXpath = By.xpath("//div[@id='modal']/div[2]/div[3]/p");
    private final By clickHereButtonXpath = By.xpath("//a[@id='restart-ad']");

    public EntryAd verifyIfModalWindowIsVisible(){
        verifyThatElementIsNotVisible(modalCloseDivXpath);
        test.log(LogStatus.INFO,"Modal Window is visible");
        return this;
    }

    public EntryAd clickOnModalWindowClose(){
        click(modalCloseDivXpath);
        test.log(LogStatus.INFO,"Close is clicked");
        return this;
    }

    public EntryAd clickOnClickHereButton(){
        click(clickHereButtonXpath);
        test.log(LogStatus.INFO,"Click Here is clicked");
        return this;
    }
}
