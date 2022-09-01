package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class AddRemoveElements extends MainMethods {

    public final By addElementButtonXpath = By.xpath("//div[@id='content']/div/button");
    public final By deleteFirstButtonXpath = By.xpath("//div[@id='elements']/button");

    public AddRemoveElements verifyIfAddElementButtonIsVisible(){
        verifyThatElementIsVisible(addElementButtonXpath);
        test.log(LogStatus.INFO,"Add Element Button is visible");
        return this;
    }

    public AddRemoveElements clickOnAddElementButton(){
        click(addElementButtonXpath);
        test.log(LogStatus.INFO,"Add Element Button is clicked");
        return this;
    }

    public AddRemoveElements verifyIfDeleteButtonIsNotVisible(){
        verifyThatElementIsNotVisible(deleteFirstButtonXpath);
        test.log(LogStatus.INFO,"Delete Button is not visible");
        return this;
    }

    public AddRemoveElements verifyIfDeleteButtonIsVisible(){
        verifyThatElementIsVisible(deleteFirstButtonXpath);
        test.log(LogStatus.INFO,"Delete Button is visible");
        return this;
    }
    public AddRemoveElements clickOnDeleteButton(){
        click(deleteFirstButtonXpath);
        test.log(LogStatus.INFO,"Delete Button is clicked");
        return this;
    }
}
