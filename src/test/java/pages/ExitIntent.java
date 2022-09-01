package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

import java.awt.*;

public class ExitIntent extends MainMethods {

    private final By modalWindowCloseButtonXpath = By.xpath("//*[@id='ouibounce-modal']/div[2]/div[3]/p");

    public ExitIntent moveMouseOutOfScreen() throws AWTException, InterruptedException {
        Thread.sleep(1000);
        Robot firstMove = new Robot();
        firstMove.mouseMove(500, 200);

        Thread.sleep(1000);
        Robot secondMove = new Robot();
        secondMove.mouseMove(0, 0);

        Thread.sleep(1000);
        Robot thirdMove = new Robot();
        thirdMove.mouseMove(500, 200);

        Thread.sleep(1000);
        test.log(LogStatus.INFO,"[Mouse] is moved");
        return this;
    }
    public ExitIntent verifyIfModalWindowIsVisible(){
        verifyThatElementIsVisible(modalWindowCloseButtonXpath);
        test.log(LogStatus.INFO,"Modal Window is visible");
        return this;
    }
    public ExitIntent clickOnCloseModalWindow(){
        click(modalWindowCloseButtonXpath);
        test.log(LogStatus.INFO,"Close is clicked");
        return this;
    }
}
