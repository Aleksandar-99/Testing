package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeyPresses extends MainMethods{

    private final By inputFieldToSendKeys = By.xpath("//input[@id='target']");
    private final By yourTextXpath = By.xpath("//p[@id='result']");

    public KeyPresses sendKey(Keys key){
        WebElement we = getDriver().findElement(inputFieldToSendKeys);
        we.sendKeys(key);
        test.log(LogStatus.INFO,"Entered New Key is pressed");
        return this;
    }

    public KeyPresses getResultText(){
        String text = getDriver().findElement(yourTextXpath).getText();
        test.log(LogStatus.INFO,"Press: Key - " + text);
        return this;
    }
}
