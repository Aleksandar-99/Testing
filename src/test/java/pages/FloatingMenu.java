package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class FloatingMenu extends MainMethods {

    private final By menuXpath = By.xpath("//div[@id='menu']");
    private String heightStyleCode = "";

    public FloatingMenu saveCurrentHeight(){
        heightStyleCode = getDriver().findElement(menuXpath).getAttribute("Style");
        test.log(LogStatus.INFO,"Floating Menu: Position Style - " + heightStyleCode);
        return this;
    }

    public FloatingMenu scrollToBottomOfPage(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)", "");

        test.log(LogStatus.INFO,"The Page is scrolled");
        return this;
    }

    public FloatingMenu compareIfFloatingMenuHeightChanged(){
        String newHeight = getDriver().findElement(menuXpath).getAttribute("Style");
        if(heightStyleCode != newHeight) {
            test.log(LogStatus.INFO, "Floating Menu: Position Style - " + newHeight );
        }
        return this;
    }
}
