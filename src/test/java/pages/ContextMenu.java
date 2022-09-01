package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu extends MainMethods{

    public final By squareXpath = By.xpath("//div[@id='hot-spot']");

    public ContextMenu rightClickSquareBox(){
        Actions actions = new Actions(getDriver());
        WebElement elementLocator = getDriver().findElement(squareXpath);
        actions.contextClick(elementLocator).perform();

        test.log(LogStatus.INFO,"Square Box is right clicked ");
        return this;
    }

    public ContextMenu clickOnOkOnAlert(){
        getDriver().switchTo().alert().accept();
        getDriver().quit();
        driver = null;
        driver = new ChromeDriver();
        getDriver().manage().window().maximize();

        test.log(LogStatus.INFO,"OK on Alert is clicked");
        return this;
    }
}
