package com.dollardays.testcases;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.Fav;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.orderHistory;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;

public class FavTestcase extends BaseTest {
	

	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Favorites",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_01_Favourites(Hashtable<String, String> datatable) throws Exception
	{
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		ExtentTestManager.getTest().log(Status.INFO, "login tstcase");
		Thread.sleep(1000);
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		Fav fav=new Fav(driver);
		
		fav.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		fav.fav_link().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the Favourites link");
		Thread.sleep(2000);
		
		WebElement element=fav.get_sortby();
		Select sel=new Select(element);
		sel.selectByVisibleText("Newest First");
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the sortby dropdown");
		Thread.sleep(2000);
		
		/*WebElement ele=fav.get_view();
		Select sele=new Select(ele);
		//((JavascriptExecutor)driver).executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }", ele, "12");
		sele.selectByVisibleText("12");
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the view dropdown");*/
		fav.get_view().click();
		Thread.sleep(2000);
		
		VideoRecorder_utlity.stopRecord();
		
		
	}

}
	
	/*@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
    public void TC_02_Favourites(Hashtable<String, String> datatable) throws InterruptedException, UnsupportedEncodingException, GeneralSecurityException
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase 1 : Verify clicking on Favourites link");
		LoginPage loginPage = new LoginPage(driver);
		ExtentTestManager.getTest().log(Status.PASS, "Step 1  : Login with Valid credentials");
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
		Thread.sleep(1000);	
		Fav fav=new Fav(driver);
		
		fav.getUserDropdown().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 2  : Click on the user icon");
		
		fav.fav_link().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step 3  : Click on the Favourites link");
		
		fav.get_addtocart().click();
		Thread.sleep(2000);
		fav.get_cart().click();
		fav.updatecart_more().click();
		Thread.sleep(2000);
		fav.updatecart_less().click();
		Thread.sleep(2000);
		fav.get_update();
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0,3000);");
		Thread.sleep(1000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0, -3000);");
		Thread.sleep(1000);
		
}*/

