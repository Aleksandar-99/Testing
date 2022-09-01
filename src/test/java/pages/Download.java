package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

import java.io.File;

public class Download extends MainMethods{

    private final By imageDownloadXpath = By.xpath("//div[@id='content']/div/a[1]");
    String home = System.getProperty("user.home");
    File image;

    public Download imageDownloadPathClick() throws InterruptedException {
        click(imageDownloadXpath);
        image = new File(home+"/Downloads/" + getDriver().findElement(imageDownloadXpath).getText());
        Thread.sleep(2000);
        test.log(LogStatus.INFO,"Image is downloaded");
        return this;
    }

    public Download checkIfImageIsDownloaded(){
        if(image.exists())
        {
            test.log(LogStatus.INFO,"Downloaded Image exists");
        }
        return this;
    }

    public Download deleteDownloadedImage(){
        if(image.delete())
        {
            test.log(LogStatus.INFO,"Downloaded Image is deleted");
        }
        return this;
    }
}
