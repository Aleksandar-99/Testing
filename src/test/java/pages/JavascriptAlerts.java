package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class JavascriptAlerts extends MainMethods{

    private final By resultTextXpath = By.xpath("//p[@id='result']");

    public JavascriptAlerts clickOnButtonFromList(int id){
        click(By.xpath("//div[@id='content']/div/ul/li[" + id + "]/button"));
        test.log(LogStatus.INFO,"Button is clicked - " + id);
        return this;
    }

    public JavascriptAlerts acceptAlert(){
        getDriver().switchTo().alert().accept();
        test.log(LogStatus.INFO,"Alert: Accept");
        return this;
    }

    public JavascriptAlerts sendTextAndAcceptAlert(){
        getDriver().switchTo().alert().sendKeys("Test");
        getDriver().switchTo().alert().accept();
        test.log(LogStatus.INFO,"Alert: Type Test and Accept");
        return this;
    }

    public JavascriptAlerts getResultText(){
        String text = getDriver().findElement(resultTextXpath).getText();
        test.log(LogStatus.INFO,"Result: " + text);
        return this;
    }
}
