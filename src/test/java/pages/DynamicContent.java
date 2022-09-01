package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class DynamicContent extends MainMethods{

    private final By DivWithTextToGetXpath = By.xpath("//div[@id='content']/div[3]/div[2]");
    private final By ClickHereXpath = By.xpath("//div[@id='content']/div/p[2]/a");
    private String textToCheck = "";

    public DynamicContent saveCurrentText(){
        textToCheck = getDriver().findElement(DivWithTextToGetXpath).getText();
        test.log(LogStatus.INFO,"Current text: " + textToCheck);
        return this;
    }

    public DynamicContent compareCurrentText(){
        String newText = getDriver().findElement(DivWithTextToGetXpath).getText();
        if(!newText.equals(textToCheck)) { test.log(LogStatus.INFO,"NEW TEXT: Text Was Changed, New Text: " + newText);}
        else { test.log(LogStatus.INFO,"Old text: Text Was Not Changed");}
        return this;
    }

    public DynamicContent clickOnClickHereButton(){
        click(ClickHereXpath);
        test.log(LogStatus.INFO,"Click Here button is clicked");
        return this;
    }

}
