package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class ShiftingContent extends MainMethods{

    private final By imageXpath = By.xpath("//div[@id='content']/div/img");

    public ShiftingContent clickOnHereButton(){
        WebElement element = getDriver().findElement(imageXpath);
        Point point = element.getLocation();
        int xcord = point.getX();

        test.log(LogStatus.INFO,"Image: From Left Side - " + xcord + "px");
        return this;
    }

    public ShiftingContent refreshPageFunction(){
        getDriver().navigate().refresh();
        test.log(LogStatus.INFO,"Page is refreshed");
        return this;
    }
}
