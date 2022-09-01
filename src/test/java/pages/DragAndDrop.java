package pages;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DragAndDrop extends MainMethods{

    private final By BoxAXpath = By.xpath("//div[@id='column-a']");
    private final By BoxBXpath = By.xpath("//div[@id='column-b']");
    private final By firstBoxXpath = By.xpath("//div[@id='columns']/div[1]/header");
    final String java_script = "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" + "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun"
            + "ction(format,data){this.items[format]=data;this.types.append(for" + "mat);},getData:function(format){return this.items[format];},clea" +
            "rData:function(format){}};var emit=function(event,target){var ev" + "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
            "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" + "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
            "'drop',tgt);emit('dragend',src);";

    public DragAndDrop swapBoxes(){

        WebElement From = getDriver().findElement(BoxAXpath);
        WebElement To = getDriver().findElement(BoxBXpath);

        ((JavascriptExecutor) getDriver()).executeScript(java_script, From, To);

        test.log(LogStatus.INFO,"Box A & Box B are swapped");
        return this;
    }

    public DragAndDrop verifyFirstBox(){
        WebElement FirstBox = getDriver().findElement(firstBoxXpath);

        if(FirstBox.getText().equals("A")) { test.log(LogStatus.INFO,"First Box is Box A is verified");}
        else if(FirstBox.getText().equals("B")){ test.log(LogStatus.INFO, "First Box is Box B is verified");}
        return this;
    }
}
