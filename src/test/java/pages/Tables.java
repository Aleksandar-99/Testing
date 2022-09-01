package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tables extends MainMethods{

    private final By lastNameCellXpath = By.xpath("//table[@id='table1']/thead/tr/th[1]/span");
    private final By firstCellValueXpath = By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]");

    public Tables getValueOfFirstCell(){
        WebElement element = getDriver().findElement(firstCellValueXpath);
        String value = element.getText();

        test.log(LogStatus.INFO,"Last Name: First Cell - " + value);
        return this;
    }

    public Tables clickOnSortLastName(){
        click(lastNameCellXpath);
        test.log(LogStatus.INFO,"Last Name is sorted");
        return this;
    }
}
