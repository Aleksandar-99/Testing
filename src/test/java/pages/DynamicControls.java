package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicControls extends MainMethods{

    private final By RemoveAddButtonXpath = By.xpath("//form[@id='checkbox-example']/button");
    private final By CheckBoxDivXpath = By.xpath("//input[@type='checkbox']");
    private final By EnableDisableButtonXpath = By.xpath("//form[@id='input-example']/button");
    private final By TextFieldDivXpath = By.xpath("//form[@id='input-example']/input");

    public DynamicControls verifyIfCheckboxIsVisible(){
        verifyThatElementIsVisible(CheckBoxDivXpath);
        test.log(LogStatus.INFO,"Checkbox is visible");
        return this;
    }
    public DynamicControls verifyIfCheckboxIsNotVisible(){
        verifyThatElementIsNotVisible(CheckBoxDivXpath);
        test.log(LogStatus.INFO,"Checkbox is not visible");
        return this;
    }
    public DynamicControls clickOnRemoveAddButton(){
        click(RemoveAddButtonXpath);
        test.log(LogStatus.INFO,"Remove/Add Button is clicked");
        return this;
    }
    public DynamicControls checkThatTextfieldIsEnabled(){
        WebElement textfield = getDriver().findElement(TextFieldDivXpath);
        if(textfield.isEnabled()){ test.log(LogStatus.INFO,"ENABLED: Textfield");}
        else { test.log(LogStatus.INFO,"DISABLED: Textfield");}
        return this;
    }
    public DynamicControls clickOnEnableDisableButton(){
        click(EnableDisableButtonXpath);
        test.log(LogStatus.INFO,"Enable/Disable Button is clicked");
        return this;
    }
}
