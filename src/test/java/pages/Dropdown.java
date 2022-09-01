package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends MainMethods{

    private final By SelectXpath = By.xpath("//select[@id='dropdown']");
    private final By Option1 = By.xpath("//select[@id='dropdown']/option[2]");
    private final By Option2 = By.xpath("//select[@id='dropdown']/option[3]");

    public Dropdown selectOption1(){
        click(Option1);
        test.log(LogStatus.INFO,"Option1 is clicked/selected");
        return this;
    }

    public Dropdown selectOption2(){
        click(Option2);
        test.log(LogStatus.INFO,"Option2 is clicked/selected");
        return this;
    }

    public Dropdown selectOptionFromDropdownText(){
        String selectedAuthen = new Select(driver.findElement(SelectXpath)).getFirstSelectedOption().getText();
        test.log(LogStatus.INFO,"Selected: " + selectedAuthen);
        return this;
    }
}
