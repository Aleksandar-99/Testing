package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Upload extends MainMethods{

    private final By chooseFileXpath = By.xpath("//input[@id='file-upload']");
    private final By uploadButtonXpath = By.xpath("//input[@id='file-submit']");
    private final By uploadedFileConfirmationXpath = By.xpath("//div[@id='uploaded-files']");

    public Upload uploadFile(){
        WebElement browse = getDriver().findElement(chooseFileXpath);
        browse.sendKeys(System.getProperty("user.dir") + "\\target\\tests\\files\\upload.txt");
        test.log(LogStatus.INFO,"upload.txt is uploaded");
        return this;
    }

    public Upload clickOnUpload(){
        click(uploadButtonXpath);
        test.log(LogStatus.INFO,"Upload is clicked");
        return this;
    }

    public Upload verifyIfFileSuccessfullyUploaded(){
        verifyThatElementIsVisible(uploadedFileConfirmationXpath);
        test.log(LogStatus.INFO,"Uploaded File is visible");
        return this;
    }
}
