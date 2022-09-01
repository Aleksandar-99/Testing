package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class JqueryUi extends MainMethods {

    private final By enabledButtonXpath = By.xpath("//a[@id='ui-id-2']");
    private final By backToJqueryXpath = By.xpath("//a[@id='ui-id-5']");
    private final By menuButtonXpath = By.xpath("//div[@id='content']/div/div/ul/li/a");

    public JqueryUi clickOnEnabledButton(){
        click(enabledButtonXpath);
        test.log(LogStatus.INFO,"Enabled Button is clicked");
        return this;
    }

    public JqueryUi clickOnBackToJqueryButton(){
        click(backToJqueryXpath);
        test.log(LogStatus.INFO,"Back To Jquery UI Button is clicked");
        return this;
    }

    public JqueryUi clickOnMenuButton(){
        click(menuButtonXpath);
        test.log(LogStatus.INFO,"Menu Button is clicked");
        return this;
    }

    public JqueryUi verifyIfBackToMenuButtonIsVisible(){
        verifyThatElementIsVisible(enabledButtonXpath);
        test.log(LogStatus.INFO,"Jquery UI Menu is visible");
        return this;
    }
}
