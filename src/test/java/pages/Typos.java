package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Typos extends MainMethods{

    private final By typeTextParagraphXpath = By.xpath("//div[@id='content']/div/p[2]");
    private String textToCompare = "Sometimes you'll see a typo, other times you won't.";

    public Typos compareTextWithCorrectOne(){
        WebElement element = getDriver().findElement(typeTextParagraphXpath);
        String value = element.getText();

        if(value.equals(textToCompare)){ test.log(LogStatus.INFO,"[Result]: There are no typos");}
        else { test.log(LogStatus.INFO,"Result: There was a typos");}

        return this;
    }

    public Typos refreshPageFunction(){
        getDriver().navigate().refresh();
        test.log(LogStatus.INFO,"Page is refreshed");
        return this;
    }
}
