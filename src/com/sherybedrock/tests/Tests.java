package com.sherybedrock.tests;

import com.sherybedrock.methods.FormsLogic;
import com.sherybedrock.utils.Utils;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Tests {

    private static final String ORACLE_LINK = "https://eclf.fa.em2.oraclecloud.com";
    private static WebDriver driver;

    @Test
    public static void submitTimeCard() {
        driver = Utils.newDriver();
        driver.manage().window().maximize();
        driver.get(ORACLE_LINK);

        Utils.waitInSeconds(2);
        FormsLogic.fillTimeCardForms(driver);
        Utils.waitInSeconds(2);

    }

    @AfterMethod
    public void closeBrowser() {
        Utils.waitInSeconds(2);
        driver.close();
    }

}