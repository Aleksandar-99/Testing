package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers extends MainMethods{

    private final By Elemen = By.xpath("//div[@id='content']/div/a/i");

    public Hovers mouseOverElement(int id){
        Actions action = new Actions(getDriver());
        WebElement we = getDriver().findElement(By.xpath("//div[@id='content']/div/div[" + id + "]/img"));
        action.moveToElement(we).build().perform();
        test.log(LogStatus.INFO,"Hover: Picture - " + id);
        return this;
    }

    public Hovers verifyIfElementVisibilityAfterHover(int id){
        verifyThatElementIsVisible(By.xpath("//div[@id='content']/div/div[" + id + "]/div/h5"));
        test.log(LogStatus.INFO,"Visible: Description for image - " + id);
        return this;
    }

}
