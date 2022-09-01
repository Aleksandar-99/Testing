package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenImages extends MainMethods {

    public final By BrokenImagesXpath = By.xpath("//*[@id='content']/div/h3");

    public BrokenImages verifyIfOnMainPage(){
        verifyThatElementIsVisible(BrokenImagesXpath);
        test.log(LogStatus.INFO,"[Broken Images page] is visible");
        return this;
    }

    public BrokenImages checkBrokenImages(){
        getDriver().get("http://the-internet.herokuapp.com/broken_images");
        for (WebElement image : getDriver().findElements(By.cssSelector("img")))
        {
            if (image.getAttribute("naturalWidth").equals("0"))
            {
                test.log(LogStatus.INFO,"[Broken]: " + image.getAttribute("src"));
            }
        }
        return this;
    }
}
