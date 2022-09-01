package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Inputs extends MainMethods {

    private final By inputFieldXpath = By.xpath("//div[@id='content']/div/div/div/input");

    public Inputs typeInInputField(){
        type(inputFieldXpath, "5");
        test.log(LogStatus.INFO,"Input Field is typed -5");
        return this;
    }

    public Inputs pressUpArrowFiveTimes(){
        WebElement inputField = getDriver().findElement(inputFieldXpath);
        for(int i = 0; i < 5; i++){inputField.sendKeys(Keys.UP);}

        test.log(LogStatus.INFO,"Input Field is typed +5");
        return this;
    }

    public Inputs pressDownArrowSevenTimes(){
        WebElement inputField = getDriver().findElement(inputFieldXpath);
        for(int i = 0; i < 7; i++){inputField.sendKeys(Keys.DOWN);}

        test.log(LogStatus.INFO,"Input Field is typed -7");
        return this;
    }
}
