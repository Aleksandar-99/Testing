package tests;

import main.MainMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;

public class TheInternetHerokuappAllFunctionsTest extends MainMethods {

    @BeforeClass
    public void setUp(){
        createDriver();
    }

    @Test
    public void test01AddRemoveElements(){

        openApplication("http://the-internet.herokuapp.com/add_remove_elements/");
        createReport("Add/Remove Elements Test");

        AddRemoveElements addRemoveElements_page = new AddRemoveElements();
        addRemoveElements_page.verifyIfAddElementButtonIsVisible()
                              .verifyIfDeleteButtonIsNotVisible()
                              .clickOnAddElementButton()
                              .verifyIfDeleteButtonIsVisible()
                              .clickOnDeleteButton()
                              .verifyIfDeleteButtonIsNotVisible();
    }

    @Test
    public void test02BasicAuth(){

        openApplication("http://the-internet.herokuapp.com/basic_auth");
        createReport("Basic Auth Test");

        BasicAuth basicAuth_page = new BasicAuth();
        basicAuth_page.loginWithPredefinedUsernameAndPassword()
                      .verifyIfOnTheRightPage();
    }

    @Test
    public void test03BrokenImages(){

        openApplication("http://the-internet.herokuapp.com/broken_images");
        createReport("Broken Images Test");

        BrokenImages brokenImages_page = new BrokenImages();
        brokenImages_page.verifyIfOnMainPage()
                         .checkBrokenImages();
    }
    @Test
    public void test04ChallengingDom(){

        openApplication("http://the-internet.herokuapp.com/challenging_dom");
        createReport("Challenging DOM Test");

        ChallengingDom challengingDom_page = new ChallengingDom();
        challengingDom_page.getNameOfFirstButton()
                           .getNameOfFirstCell()
                           .getCanvasValue();
    }
    @Test
    public void test05Checkboxes(){

        openApplication("http://the-internet.herokuapp.com/checkboxes");
        createReport("Checkboxes Test");

        Checkboxes checkboxes_page = new Checkboxes();
        checkboxes_page.checkCheckboxState()
                       .clickOnCheckbox()
                       .checkCheckboxState()
                       .clickOnCheckbox()
                       .checkCheckboxState();
    }

    @Test
    public void test06ContextMenu(){

        openApplication("http://the-internet.herokuapp.com/context_menu");
        createReport("Context Menu Test");

        ContextMenu contextMenu_page = new ContextMenu();
        contextMenu_page.rightClickSquareBox()
                        .clickOnOkOnAlert();
    }

    @Test
    public void test07DigestAuth(){

        openApplication("http://the-internet.herokuapp.com/digest_auth");
        createReport("Digest Auth Test");

        DigestAuth digestAuth_page = new DigestAuth();
        digestAuth_page.loginWithPredefinedUsernameAndPassword()
                       .verifyIfOnTheRightPage();
    }

    @Test
    public void test08DragAndDrop(){

        openApplication("http://the-internet.herokuapp.com/drag_and_drop");
        createReport("Drag and Drop Test");

        DragAndDrop dragAndDrop_page = new DragAndDrop();
        dragAndDrop_page.verifyFirstBox()
                        .swapBoxes()
                        .verifyFirstBox();
    }

    @Test
    public void test09Dropdown(){

        openApplication("http://the-internet.herokuapp.com/dropdown");
        createReport("Dropdown List Test");

        Dropdown dropdown_page = new Dropdown();
        dropdown_page.selectOptionFromDropdownText()
                     .selectOption1()
                     .selectOptionFromDropdownText()
                     .selectOption2()
                     .selectOptionFromDropdownText();
    }

    @Test
    public void test10DynamicContent(){

        openApplication("http://the-internet.herokuapp.com/dynamic_content?with_content=static");
        createReport("Dynamic Content Test");

        DynamicContent dynamicContent_page = new DynamicContent();
        dynamicContent_page.saveCurrentText()
                           .clickOnClickHereButton()
                           .compareCurrentText()
                           .clickOnClickHereButton()
                           .compareCurrentText();
    }

    @Test
    public void test11DynamicControls(){

        openApplication("http://the-internet.herokuapp.com/dynamic_controls");
        createReport("Dynamic Controls Test");

        DynamicControls dynamicControls_page = new DynamicControls();
        dynamicControls_page.verifyIfCheckboxIsVisible()
                            .clickOnRemoveAddButton()
                            .verifyIfCheckboxIsNotVisible()
                            .clickOnRemoveAddButton()
                            .verifyIfCheckboxIsVisible()
                            .checkThatTextfieldIsEnabled()
                            .clickOnEnableDisableButton()
                            .checkThatTextfieldIsEnabled()
                            .clickOnEnableDisableButton()
                            .checkThatTextfieldIsEnabled();
    }

    @Test
    public void test12DynamicLoading(){

        openApplication("http://the-internet.herokuapp.com/dynamic_loading/2");
        createReport("Dynamically Loaded Page Elements Test");

        DynamicLoading dynamicLoading_page = new DynamicLoading();
        dynamicLoading_page.clickOnStartButton()
                           .verifyIfLoadingDivIsVisible()
                           .verifyIfFinishDivIsVisible();
    }

    @Test
    public void test13EntryAd(){

        openApplication("http://the-internet.herokuapp.com/entry_ad");
        createReport("Entry Ad Test");

        EntryAd entryAd_page = new EntryAd();
        entryAd_page.verifyIfModalWindowIsVisible()
                    .clickOnModalWindowClose()
                    .clickOnClickHereButton()
                    .verifyIfModalWindowIsVisible()
                    .clickOnModalWindowClose();
    }

    @Test
    public void test14ExitIntent() throws AWTException, InterruptedException {

        openApplication("http://the-internet.herokuapp.com/exit_intent");
        createReport("Exit Intent Test");

        ExitIntent exitIntent_page = new ExitIntent();
        exitIntent_page.moveMouseOutOfScreen()
                       .verifyIfModalWindowIsVisible()
                       .clickOnCloseModalWindow();
    }

    @Test
    public void test15Download() throws InterruptedException {

        openApplication("http://the-internet.herokuapp.com/download");
        createReport("File Downloader Test");

        Download download_page = new Download();
        download_page.imageDownloadPathClick()
                     .checkIfImageIsDownloaded()
                     .deleteDownloadedImage();
    }

    @Test
    public void test16Upload(){

        openApplication("http://the-internet.herokuapp.com/upload");
        createReport("File Uploader Test");

        Upload upload_page = new Upload();
        upload_page.uploadFile()
                   .clickOnUpload()
                   .verifyIfFileSuccessfullyUploaded();
    }

    @Test
    public void test17FloatingMenu(){

        openApplication("http://the-internet.herokuapp.com/floating_menu");
        createReport("Floating Menu Test");

        FloatingMenu floatingMenu_page = new FloatingMenu();
        floatingMenu_page.saveCurrentHeight()
                         .scrollToBottomOfPage()
                         .compareIfFloatingMenuHeightChanged();
    }

    @Test
    public void test18ForgotPassword(){

        openApplication("http://the-internet.herokuapp.com/forgot_password");
        createReport("Forgot Password Test");

        ForgotPassword forgotPassword_page = new ForgotPassword();
        forgotPassword_page.typeEmailIntoInputField()
                           .clickOnRetrievePasswordButton();
    }

    @Test
    public void test19Login(){

        openApplication("http://the-internet.herokuapp.com/login");
        createReport("Login Page Test");

        Login login_page = new Login();
        login_page.verifyIfOnLoginPage()
                  .typeUsernameIntoInputField()
                  .typePasswordIntoInputField()
                  .clickOnLoginButton()
                  .verifyIfLoginSuccessfully()
                  .clickOnLogout()
                  .verifyIfOnLoginPage();
    }

    @Test
    public void test20HorizontalSlider(){

        openApplication("http://the-internet.herokuapp.com/horizontal_slider");
        createReport("Horizontal Slider Test");

        HorizontalSlider horizontalSlider_page = new HorizontalSlider();
        horizontalSlider_page.scrollSliderTwoRight()
                             .getSliderValue()
                             .scrollSliderTwoLeft()
                             .getSliderValue()
                             .scrollSliderTwoRight()
                             .getSliderValue();
    }

    @Test
    public void test21Hovers(){

        openApplication("http://the-internet.herokuapp.com/hovers");
        createReport("Hovers Test");

        Hovers hovers_page = new Hovers();
        hovers_page.mouseOverElement(1)
                   .verifyIfElementVisibilityAfterHover(1)
                   .mouseOverElement(2)
                   .verifyIfElementVisibilityAfterHover(2)
                   .mouseOverElement(3)
                   .verifyIfElementVisibilityAfterHover(3);
    }

    @Test
    public void test22Inputs(){

        openApplication("http://the-internet.herokuapp.com/inputs");
        createReport("Inputs Test");

        Inputs inputs_page = new Inputs();
        inputs_page.typeInInputField()
                   .pressUpArrowFiveTimes()
                   .pressDownArrowSevenTimes();
    }

    @Test
    public void test23JQueryUi(){

        openApplication("http://the-internet.herokuapp.com/jqueryui/menu");
        createReport("JQueryUI Test");

        JqueryUi jqueryUi_page = new JqueryUi();
        jqueryUi_page.verifyIfBackToMenuButtonIsVisible()
                     .clickOnEnabledButton()
                     .clickOnBackToJqueryButton()
                     .clickOnMenuButton()
                     .verifyIfBackToMenuButtonIsVisible();
    }

    @Test
    public void test24JavascriptAlerts(){

        openApplication("http://the-internet.herokuapp.com/javascript_alerts");
        createReport("JavaScript Alerts Test");

        JavascriptAlerts javascriptAlerts_page = new JavascriptAlerts();
        javascriptAlerts_page.clickOnButtonFromList(1)
                             .acceptAlert()
                             .getResultText()
                             .clickOnButtonFromList(2)
                             .acceptAlert()
                             .getResultText()
                             .clickOnButtonFromList(3)
                             .sendTextAndAcceptAlert()
                             .getResultText();
    }

    @Test
    public void test25KeyPresses(){

        openApplication("http://the-internet.herokuapp.com/key_presses");
        createReport("Key Presses Test");

        KeyPresses keyPresses_page = new KeyPresses();
        keyPresses_page.sendKey(Keys.NUMPAD9)
                       .getResultText()
                       .sendKey(Keys.ARROW_RIGHT)
                       .getResultText()
                       .sendKey(Keys.F3)
                       .getResultText();
    }

    @Test
    public void test26Windows(){

        openApplication("http://the-internet.herokuapp.com/windows");
        createReport("Opening a new window Test");

        Windows windows_page = new Windows();
        windows_page.clickOnClickHereButton()
                    .changeTab(0)
                    .changeTab(1)
                    .changeTab(0);
    }

    @Test
    public void test27NestedFrames(){

        openApplication("http://the-internet.herokuapp.com/nested_frames");
        createReport("Nested Frames Test");

        NestedFrames nestedFrames_page = new NestedFrames();
        nestedFrames_page.frameTopLeft()
                         .frameTopRight()
                         .frameBottom();
    }

    @Test
    public void test28NotificationMessageRendered(){

        openApplication("http://the-internet.herokuapp.com/notification_message_rendered");
        createReport("Notification Message Test");

        NotificationMessageRendered notificationMessageRendered_page = new NotificationMessageRendered();
        notificationMessageRendered_page.verifyIfNotificationIsNotVisible()
                                        .clickOnClickHereButton()
                                        .verifyIfNotificationIsVisible();
    }

    @Test
    public void test29Redirector(){

        openApplication("http://the-internet.herokuapp.com/redirector");
        createReport("Redirection Test");

        Redirector redirector_page = new Redirector();
        redirector_page.clickOnHereButton()
                       .verifyIfRedirectPageIsVisible();
    }

    @Test
    public void test30ShiftingContent(){

        openApplication("http://the-internet.herokuapp.com/shifting_content/image");
        createReport("Shifting Content: Image Test");

        ShiftingContent shiftingContent_page = new ShiftingContent();
        shiftingContent_page.clickOnHereButton()
                            .refreshPageFunction()
                            .clickOnHereButton()
                            .refreshPageFunction()
                            .clickOnHereButton();
    }

    @Test
    public void test31Tables(){
        openApplication("http://the-internet.herokuapp.com/tables");
        createReport("Data Tables Test");

        Tables tables_page = new Tables();
        tables_page.getValueOfFirstCell()
                   .clickOnSortLastName()
                   .getValueOfFirstCell()
                   .clickOnSortLastName()
                   .getValueOfFirstCell();
    }
    @Test
    public void test32Typos(){

        openApplication("http://the-internet.herokuapp.com/typos");
        createReport("Typos Test");
        Typos typos_page = new Typos();
        typos_page.compareTextWithCorrectOne()
                  .refreshPageFunction()
                  .compareTextWithCorrectOne()
                  .refreshPageFunction()
                  .compareTextWithCorrectOne()
                  .refreshPageFunction()
                  .compareTextWithCorrectOne()
                  .refreshPageFunction()
                  .compareTextWithCorrectOne();
    }
    @Test
    public void test33Tinymce(){

        openApplication("http://the-internet.herokuapp.com/tinymce");
        createReport("IFrame Test");

        Tinymce tinymce_page = new Tinymce();
        tinymce_page.switchToIframe();
    }
    @AfterClass
    public void close(){
        quitDriver();
    }
}
