package com.dollardays.testcases;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.submitrequestpage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;

public class SRTestcase  extends BaseTest{

@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
public void submitrequestpage(Hashtable<String, String> datatable) throws Exception{
//logging in to the page
ExtentTestManager.getTest().log(Status.INFO, "submit request");
Thread.sleep(1000);
LoginPage loginPage = new LoginPage(driver);
loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));

submitrequestpage sr=new submitrequestpage(driver);
//getting the help info
sr.signInBtn().click();
sr.submitARequestLink().click();
}

@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC2", runmode = "Yes")
@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
public void submitrequestpageTC2(Hashtable<String, String> datatable) throws Exception{
//logging in to the page
ExtentTestManager.getTest().log(Status.INFO, "submit request");
Thread.sleep(1000);
LoginPage loginPage = new LoginPage(driver);
loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));

submitrequestpage sr=new submitrequestpage(driver);
//getting the help info
sr.signInBtn().click();
sr.submitARequestLink().click();
sr.getEmailid().sendKeys(datatable.get("UserName"));
sr.getPhoneNumber().sendKeys(datatable.get(String.valueOf("Phone number")));
Thread.sleep(1000);
sr.getReasonType().click();
Thread.sleep(1000);
ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Click the dropdown");

sr.getSelectReasonType().click();
ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Click the option from dropdown");

sr.getOrderNo().sendKeys(datatable.get(String.valueOf("OrderNo")));


}
}
