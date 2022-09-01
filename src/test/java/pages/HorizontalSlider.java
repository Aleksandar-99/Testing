package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSlider extends MainMethods{

    private final By sliderXpath = By.xpath("//div[@id='content']/div/div/input");
    private final By sliderValueXpath = By.xpath("//span[@id='range']");

    public HorizontalSlider scrollSliderTwoRight(){
        Actions action = new Actions(getDriver());
        WebElement slider = getDriver().findElement(sliderXpath);
        action.click(slider).build().perform();
        for (int i = 0; i < 4; i++) {
            action.sendKeys(Keys.ARROW_RIGHT).build().perform();
        }

        test.log(LogStatus.INFO,"Slider: Increasing value 2.5 -> 4.5");
        return this;
    }

    public HorizontalSlider scrollSliderTwoLeft(){
        Actions action = new Actions(getDriver());
        WebElement slider = getDriver().findElement(sliderXpath);
        action.click(slider).build().perform();
        for (int i = 0; i < 4; i++) {
            action.sendKeys(Keys.ARROW_LEFT).build().perform();
        }
        test.log(LogStatus.INFO,"Slider: Decreasing Value 2.5 -> 0.5 ");
        return this;
    }
    public HorizontalSlider getSliderValue(){
        String value = getDriver().findElement(sliderValueXpath).getText();
        test.log(LogStatus.INFO,"Slider: New Value - " + value);
        return this;
    }
}
