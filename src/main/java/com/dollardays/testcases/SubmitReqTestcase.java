package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;


import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.SubmitReq;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class SubmitReqTestcase extends BaseTest {
	
	
	/*@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_01_Submit(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify clicking on Submit Request link");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		SubmitReq submitreq=new SubmitReq(driver);
		
		submitreq.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		submitreq.submitARequestLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the submit a request link");
		
	
		Thread.sleep(500);
		//loginPage.getLogoutBtn().click();
		//ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Clicked on LogOut");
	}*/

	/*@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_02_Submit(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 2 : Verify Email id, phone number other fields and click on submit");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		SubmitReq submitreq=new SubmitReq(driver);
		
		submitreq.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		Thread.sleep(1000);	
		
		submitreq.submitARequestLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the submit a request link");
		
		//submitreq.getEmailid().sendKeys(datatable.get("Emailid"));
		//ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Enter emailid");
		
		//submitreq.getPhoneNumber().sendKeys(datatable.get(String.valueOf("Phone Number")));
		//ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Enter phone number");
		
		submitreq.getPhoneNumber().sendKeys(datatable.get("Phone Number"));
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Enter phone number");
		
		submitreq.getReasonType().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Click the dropdown");
		
		submitreq.getSelectReasonType().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Click the option from dropdown");
		
		submitreq.getOrderNo().sendKeys(datatable.get("OrderNo"));
		ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Enter order number");
		Thread.sleep(1000);	
		
		submitreq.getMessage().sendKeys("Hi");
		ExtentTestManager.getTest().log(Status.PASS, "Step 7  : Enter message");
			Thread.sleep(10000);	
			
         
		//submitreq.checkbox_click().click();
		//ExtentTestManager.getTest().log(Status.PASS, "Step 8  : Clcik on the checkbox");
		
		submitreq.SubmitBtn_click().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 9  : Clcik on the submit button");
		Thread.sleep(500);
		
		//Assert.assertTrue(submitreq.getSubmitMessage());
		
		
	}
		*/


/*@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC3", runmode = "Yes")
@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
public void TC_03_Submit(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 3 : Verify without giving email id and click on submit");
	LoginPage loginPage = new LoginPage(driver);
	ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
	loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);	
	SubmitReq submitreq=new SubmitReq(driver);
	
	submitreq.getUserDropdown().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
	Thread.sleep(1000);	
	
	submitreq.submitARequestLink().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the submit a request link");
	
	//submitreq.getEmailid().sendKeys(datatable.get("Emailid"));
	//ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Enter emailid");
	
	submitreq.getEmailid().clear();
	
	//submitreq.getPhoneNumber().sendKeys(datatable.get(String.valueOf("Phone Number")));
	//ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Enter phone number");
	
	submitreq.getPhoneNumber().sendKeys(datatable.get("Phone Number"));
	ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Enter phone number");
	
	submitreq.getReasonType().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Click the dropdown");
	
	submitreq.getSelectReasonType().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Click the option from dropdown");
	
	submitreq.getOrderNo().sendKeys(datatable.get("OrderNo"));
	ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Enter order number");
	Thread.sleep(1000);	
	
	submitreq.getMessage().sendKeys("Hi");
	ExtentTestManager.getTest().log(Status.PASS, "Step 7  : Enter message");
		Thread.sleep(10000);	
		
     
	//submitreq.checkbox_click().click();
	//ExtentTestManager.getTest().log(Status.PASS, "Step 8  : Clcik on the checkbox");
	
	submitreq.SubmitBtn_click().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 9  : Clcik on the submit button");
	Thread.sleep(500);
	
	String expectedTitle = ("Email should not be blank !");
	String actualTitle = ("Email should not be blank !");
	Assert.assertEquals(actualTitle, expectedTitle, " Email should not be blank !");
	System.out.println("Message displayed successfully");

	}*/
	


@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC4", runmode = "Yes")
@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
public void TC_04_Submit(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException{
	ExtentTestManager.getTest().log(Status.PASS, "Testcase 2 : Submit without select reason type dropdown");
	LoginPage loginPage = new LoginPage(driver);
	ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
	loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
	Thread.sleep(1000);	
	SubmitReq submitreq=new SubmitReq(driver);
	
	submitreq.getUserDropdown().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
	Thread.sleep(1000);	
	
	submitreq.submitARequestLink().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the submit a request link");
	
	submitreq.getEmailid().sendKeys(datatable.get("Emailid"));
	ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Enter emailid");
	
	//submitreq.getEmailid().clear();
	
	submitreq.getPhoneNumber().sendKeys(datatable.get("Phone Number"));
	ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Enter phone number");
	
	//submitreq.getReasonType().click();
	//ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Click the dropdown");
	
	//submitreq.getSelectReasonType().click();
	//ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Click the option from dropdown");
	
	submitreq.getOrderNo().sendKeys(datatable.get("OrderNo"));
	ExtentTestManager.getTest().log(Status.PASS, "Step 6  : Enter order number");
	Thread.sleep(1000);	
	
	submitreq.getMessage().sendKeys("Hi");
	ExtentTestManager.getTest().log(Status.PASS, "Step 7  : Enter message");
		Thread.sleep(500);	
		
		((JavascriptExecutor) driver).executeScript("scroll(0,250);");
		Thread.sleep(10000);
		
    driver.switchTo().frame("a-9wt0e8vkopnm");
	submitreq.checkbox_click().click();
	ExtentTestManager.getTest().log(Status.PASS, "Step 8  : Clcik on the checkbox");
	
	submitreq.SubmitBtn_click().click();
	ExtentTestManager.getTest().log(Status.INFO, "Step 9  : Clcik on the submit button");
	Thread.sleep(500);
	
	((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
	Thread.sleep(10000);
	
	Assert.assertTrue(true, "Please select a reason.");
	ExtentTestManager.getTest().log(Status.INFO, "Step 10  : true");

}


}

