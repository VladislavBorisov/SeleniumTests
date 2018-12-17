package com.sherybedrock.methods;

import com.sherybedrock.objects.PagesNavigation;
import com.sherybedrock.utils.Utils;
import org.openqa.selenium.WebDriver;

public class FormsLogic {

    private static final String USER = "endava\\vborisov";
    private static final String PROJECT_CODE = "ELADV004 - APM Gateway";
    private static final String TASK_DETAILS = "03 - Concurrent Engineering";
    private static final String HOME_OFFICE = "Home Office";
    private static final String TIME_TYPE = "Regular";
    private static final String PASS = "5tgb^YHN7ujm";
    private static final String HOURS = "8";

    public static void fillTimeCardForms(WebDriver driver) {
        PagesNavigation.clickSignIn(driver).click();
        Utils.waitInSeconds(1);
        PagesNavigation.txtUserNameInput(driver).sendKeys(USER);
        Utils.waitInSeconds(1);
        PagesNavigation.txtPasswordInput(driver).sendKeys(PASS);
        Utils.waitInSeconds(1);
        PagesNavigation.login(driver).click();
        Utils.waitInSeconds(1);
        PagesNavigation.clickHomeIcon(driver).click();
        Utils.waitInSeconds(1);
        PagesNavigation.clickMyInfoIcon(driver).click();
        Utils.waitInSeconds(1);
        PagesNavigation.clickTimeIcon(driver).click();
        Utils.waitInSeconds(1);
        PagesNavigation.clickActionsIcon(driver).click();
        Utils.waitInSeconds(2);
        PagesNavigation.clickManageTimeCards(driver).click();
        Utils.waitInSeconds(2);
        PagesNavigation.clickCreateIcon(driver).click();
        Utils.waitInSeconds(2);
        PagesNavigation.clickCalendarOk(driver).click();
        Utils.waitInSeconds(4);
        PagesNavigation.txtProjectCode(driver).sendKeys(PROJECT_CODE);
        Utils.waitInSeconds(2);
        PagesNavigation.txtTimeType(driver).sendKeys(TIME_TYPE);
        Utils.waitInSeconds(3);
        PagesNavigation.txtLocation(driver).sendKeys(HOME_OFFICE);
        Utils.waitInSeconds(4);
        PagesNavigation.txtTaskDetails(driver).sendKeys(TASK_DETAILS);
        Utils.waitInSeconds(5);
        PagesNavigation.txtMon(driver).sendKeys(HOURS);
        Utils.waitInSeconds(3);
        PagesNavigation.txtTue(driver).sendKeys(HOURS);
        Utils.waitInSeconds(3);
        PagesNavigation.txtWed(driver).sendKeys(HOURS);
        Utils.waitInSeconds(3);
        PagesNavigation.txtThu(driver).sendKeys(HOURS);
        Utils.waitInSeconds(3);
        PagesNavigation.txtFri(driver).sendKeys(HOURS);
        Utils.waitInSeconds(3);
        PagesNavigation.clickSave(driver).click();
        Utils.waitInSeconds(18);
        PagesNavigation.clickSubmit(driver).click();
        Utils.waitInSeconds(10);
        PagesNavigation.clickOk(driver).click();
    }

}
