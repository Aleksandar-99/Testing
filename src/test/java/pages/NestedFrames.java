package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NestedFrames extends MainMethods{

    public NestedFrames frameTopLeft(){
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("/html/frameset/frame[1]")));
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("/html/frameset/frame[1]")));

        WebElement element = getDriver().findElement(By.xpath("/html/body"));
        String text = element.getText();
        driver.switchTo().defaultContent();
        test.log(LogStatus.INFO,"Frame: Top-Left Value - " + text);
        return this;
    }

    public NestedFrames frameTopRight(){
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("/html/frameset/frame[1]")));
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("/html/frameset/frame[3]")));

        WebElement element = getDriver().findElement(By.xpath("/html/body"));
        String text = element.getText();
        driver.switchTo().defaultContent();
        test.log(LogStatus.INFO,"Frame: Top-Right Value - " + text);
        return this;
    }

    public NestedFrames frameBottom(){
        getDriver().switchTo().frame(getDriver().findElement(By.xpath("/html/frameset/frame[2]")));

        WebElement element = getDriver().findElement(By.xpath("/html/body"));
        String text = element.getText();
        driver.switchTo().defaultContent();
        test.log(LogStatus.INFO,"Frame: Bottom Value - " + text);
        return this;
    }
}
