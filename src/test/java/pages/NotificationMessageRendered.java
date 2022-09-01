package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class NotificationMessageRendered extends MainMethods{

    private final By clickHereXpath = By.xpath("//div[@id='content']/div/p/a");
    private final By notificationDivXpath = By.xpath("//div[@id='flash']");

    public NotificationMessageRendered clickOnClickHereButton(){
        click(clickHereXpath);
        test.log(LogStatus.INFO,"Click Here button is clicked");
        return this;
    }

    public NotificationMessageRendered verifyIfNotificationIsNotVisible(){
        verifyThatElementIsNotVisible(notificationDivXpath);
        test.log(LogStatus.INFO,"Notification is not visible");
        return this;
    }

    public NotificationMessageRendered verifyIfNotificationIsVisible(){
        verifyThatElementIsVisible(notificationDivXpath);
        test.log(LogStatus.INFO,"Notification is visible");
        return this;
    }
}
