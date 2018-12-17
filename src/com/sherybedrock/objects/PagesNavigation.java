package com.sherybedrock.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesNavigation {

    private static WebElement element = null;

    public static WebElement clickSignIn(WebDriver driver) {
        element = driver.findElement(By.partialLinkText("Sign In"));
        return element;
    }

    public static WebElement txtUserNameInput(WebDriver driver) {
        element = driver.findElement(By.id("userNameInput"));
        return element;
    }

    public static WebElement txtPasswordInput(WebDriver driver) {
        element = driver.findElement(By.id("passwordInput"));
        return element;
    }

    public static WebElement login(WebDriver driver) {
        element = driver.findElement(By.id("submitButton"));
        return element;
    }

    public static WebElement clickHomeIcon(WebDriver driver) {
        element = driver.findElement(By.id("pt1:_UIShome::icon"));
        return element;
    }

    public static WebElement clickMyInfoIcon(WebDriver driver) {
        element = driver.findElement(By.id("groupNode_my_information_0"));
        return element;
    }

    public static WebElement clickTimeIcon(WebDriver driver) {
        element = driver.findElement(By.id("HWM_HCMWFMWORKAREA_FUSE_TIME_2"));
        return element;
    }

    public static WebElement clickActionsIcon(WebDriver driver) {
        element = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:_FOTsr1:0:pt1:sdi1::icon"));
        return element;

    }

    public static WebElement clickManageTimeCards(WebDriver driver) {
        element = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:_FOTsr1:0:pt1:r3:0:cl4"));
        return element;

    }

    public static WebElement clickCreateIcon(WebDriver driver) {
        element = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:0:AP1:AT1:_ATp:create::icon"));
        return element;
    }

    public static WebElement clickCalendarOk(WebDriver driver) {
        element = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:0:AP1:AT1:d2::ok"));
        return element;
    }

    public static WebElement txtProjectCode(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:socMatrixAttributeNumber2"));
        return element;
    }

    public static WebElement txtTimeType(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:socMatrixAttributeChar1"));
        return element;
    }

    public static WebElement txtLocation(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:socMatrixAttributeChar4"));
        return element;
    }

    public static WebElement txtTaskDetails(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:socMatrixAttributeNumber4"));
        return element;
    }

    public static WebElement txtMon(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:m1"));
        return element;
    }

    public static WebElement txtTue(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:m2"));
        return element;
    }

    public static WebElement txtWed(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:m3"));
        return element;
    }

    public static WebElement txtThu(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:m4"));
        return element;
    }

    public static WebElement txtFri(WebDriver driver) {
        element = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:1:AP1:r3:0:AT2:_ATp:ATt2:0:m5"));
        return element;
    }

    public static WebElement clickSave(WebDriver driver) {
        element = driver.findElement(By.className("xwb"));
        return element;
    }

    public static WebElement clickSubmit(WebDriver driver) {
        element = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:2:AP1:APca"));
        return element;
    }

    public static WebElement clickOk(WebDriver driver) {
        element = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSrHWM_HCMWFMWORKAREA_FUSE_TIME:0:MAnt2:1:r1:0:r3:2:AP1:cb4"));
        return element;
    }

}
