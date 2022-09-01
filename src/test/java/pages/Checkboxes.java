package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkboxes extends MainMethods{

    public final By FirstCheckboxXpath = By.xpath("//*[@id='checkboxes']/input[1]");

    public Checkboxes checkCheckboxState(){
        WebElement checkbox = getDriver().findElement(FirstCheckboxXpath);
        test.log(LogStatus.INFO,"Visible: Checkbox is: " + checkbox.isSelected());
        return this;
    }

    public Checkboxes clickOnCheckbox(){
        click(FirstCheckboxXpath);
        test.log(LogStatus.INFO,"Checkbox is clicked");
        return this;
    }
}
