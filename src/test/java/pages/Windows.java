package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class Windows extends MainMethods{

    private final By clickHereXpath = By.xpath("//div[@id='content']/div/a");

    public Windows clickOnClickHereButton(){
        click(clickHereXpath);
        test.log(LogStatus.INFO,"Click Here button is clicked");
        return this;
    }

    public Windows changeTab(int index){
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));

        test.log(LogStatus.INFO,"Change Tab: Tab - " + index);
        return this;
    }
}
