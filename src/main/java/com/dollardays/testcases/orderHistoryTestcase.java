package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.orderHistory;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class orderHistoryTestcase extends BaseTest {


	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_01_orderHistory(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify clicking on Order History link");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		orderHistory orderhis=new orderHistory(driver);
			
		
		orderhis.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		
		orderhis.orderhistoryLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the order history link");
		
		orderhis.startdatefield().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the start date field");
		
		Thread.sleep(5000);
		
	    orderhis.smonthpage();
	    ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Get the month");
	
		Thread.sleep(5000);
		
		orderhis.getstartdate().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the start date");
		Thread.sleep(500);
		
		orderhis.enddatefield().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the end date field");
		Thread.sleep(5000);
		
		orderhis.emonthpage();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Get the month");
		Thread.sleep(5000);
		
		
		orderhis.getenddate().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the end date ");
		
		orderhis.submit_btn().click();
		Thread.sleep(1000);
		
	}
		
	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_02_orderHistory(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
    
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 2: Verify by entering the start and end date in the fields");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		orderHistory orderhis=new orderHistory(driver);
		
		orderhis.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		orderhis.orderhistoryLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the order history link");
			
		
		orderhis.startdatefield().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Click on the start date field");
		orderhis.startdatefield().clear();
		orderhis.startdatefield().sendKeys(datatable.get("Start Date"));
		Thread.sleep(1000);
		
		orderhis.enddatefield().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Click on the end date field");
		orderhis.enddatefield().clear();
		orderhis.enddatefield().sendKeys(datatable.get("End Date"));
		Thread.sleep(1000);
		
		orderhis.submit_btn().click();
		Thread.sleep(1000);
		
		}
	
	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_03_orderHistory(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
    
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 3 : Verify by giving start date greater than the end date");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		orderHistory orderhis=new orderHistory(driver);
		
		orderhis.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		orderhis.orderhistoryLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the order history link");
		
		orderhis.startdatefield().click();
		orderhis.smonthpage();
		orderhis.getsdgreater().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 4  : Click on the start date field");
		Thread.sleep(5000);
		
		orderhis.enddatefield().click();
		orderhis.emonthpage();
		orderhis.getedsmaller().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 5  : Click on the end date field");
		Thread.sleep(5000);
		
		orderhis.submit_btn().click();
		Thread.sleep(5000);
			
}
	

	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_04_orderHistory(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
    
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify the previous and next button in the calendar");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		orderHistory orderhis=new orderHistory(driver);
		
		orderhis.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		orderhis.orderhistoryLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the order history link");
		
		orderhis.startdatefield().click();
		orderhis.getPrev().click();;
		Thread.sleep(2000);
		orderhis.getNext().click();;
		Thread.sleep(2000);
		orderhis.enddatefield().click();
		orderhis.getPrevEd().click();;
		Thread.sleep(2000);
		orderhis.getNextEd().click();;
		Thread.sleep(2000);
			
}
	

	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC2", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_05_orderHistory(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
    
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify all the links in order history page");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		orderHistory orderhis=new orderHistory(driver);
		
		orderhis.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		orderhis.orderhistoryLink().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the order history link");
		
		orderhis.getAccOvw().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getProfile().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getAddBk().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getWallet().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getFav().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getTax().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getOrdHis().click();
		driver.navigate().back();
		Thread.sleep(1000);
		orderhis.getLogout();
		
	
}
}
	

