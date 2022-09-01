package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tinymce extends MainMethods{

    public Tinymce switchToIframe(){
        getDriver().switchTo().frame("mce_0_ifr");

        WebElement element = getDriver().findElement(By.xpath("//body[@id='tinymce']/p"));
        String text = element.getText();

        driver.switchTo().defaultContent();
        test.log(LogStatus.INFO,"Iframe: Contains Paragraph Text - " + text);
        return this;
    }
}
