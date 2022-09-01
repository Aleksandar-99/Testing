package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ChallengingDom extends MainMethods{

    private final By firstButtonXpath = By.xpath("//div[@class='large-2 columns']/a[1]");
    private final By firstCellXpath = By.xpath("//div[@id='content']/div/div/div/div[2]/table/tbody/tr[1]/td[1]");

    public ChallengingDom getNameOfFirstButton(){
        WebElement element = getDriver().findElement(firstButtonXpath);
        String value = element.getText();
        test.log(LogStatus.INFO,"Button: Name - " + value);
        return this;
    }
    public ChallengingDom getNameOfFirstCell(){
        WebElement element = getDriver().findElement(firstCellXpath);
        String value = element.getText();

        test.log(LogStatus.INFO,"Table Cell: Name - " + value);
        return this;
    }
    public ChallengingDom getCanvasValue(){
        String answer = new String();
        ArrayList<WebElement> scripts = new ArrayList<WebElement>((ArrayList<WebElement>) getDriver().findElements(By.tagName("script")));

        for(int i = 0; i < scripts.size(); i++) {
            String focusText = scripts.get(i).getAttribute("innerHTML");
            if(focusText.contains("canvas.strokeText")) {
                answer = focusText.substring(focusText.indexOf("Answer"), focusText.indexOf("',"));
                break;
            }
        }
        test.log(LogStatus.INFO,"[Canvas]: Value - " + answer);
        return this;
    }
}
