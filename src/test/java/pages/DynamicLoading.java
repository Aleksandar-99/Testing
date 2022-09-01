package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DynamicLoading extends MainMethods{

    private final By StartButtonXpath = By.xpath("//div[@id='start']/button");
    private final By loadingDivXpath = By.xpath("//div[@id='loading']");
    private final By finishDivXpath = By.xpath("//div[@id='finish']");

    public DynamicLoading clickOnStartButton(){
        click(StartButtonXpath);
        test.log(LogStatus.INFO,"Start Button is clicked");
        return this;
    }

    public DynamicLoading verifyIfLoadingDivIsVisible(){
        verifyThatElementIsVisible(loadingDivXpath);
        test.log(LogStatus.INFO,"Loading... is visible");
        return this;
    }

    public DynamicLoading verifyIfFinishDivIsVisible(){
        verifyThatElementIsVisible(finishDivXpath);
        test.log(LogStatus.INFO,"Hello World! is visible");
        return this;
    }
}
