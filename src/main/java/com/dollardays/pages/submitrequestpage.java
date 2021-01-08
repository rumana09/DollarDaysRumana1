package com.dollardays.pages;





import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.dollardays.commons.Base64;

public class submitrequestpage{

WebDriver driver;

public submitrequestpage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}


@FindBy(xpath="//h1[contains(text(),'Submit a request')]")
private WebElement submitequesttext;

public WebElement getrequesttext()
{
return submitequesttext;
}



@FindBy(xpath="//p[contains(text(),'We’re here to help you! Please provide us with as ')]")
private WebElement helptext;

public WebElement gethelptext()
{
return helptext;
}

@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
private WebElement signInBtn;

public WebElement signInBtn() {
return signInBtn;

}
@FindBy(linkText = "Submit A Request")
private WebElement submitARequestLink;

public WebElement submitARequestLink() {
return submitARequestLink;

}

//Email id field
	
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtemail']")
	public WebElement Emailid;
	
//Emailid field MEthod
	
	public WebElement getEmailid() {
		return Emailid;
	}
	
//Phone number filed
	
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtPhone']")
	public WebElement PhoneNumber;

	//Phone number method
	
	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}
	
	// Reason Type Dropdown
	
		@FindBy(xpath="//selecct[@id='ctl00_cphContent_drpReason']")
		public WebElement ReasonType;
		
		// Reason Type Dropdown Method
		
		public WebElement getReasonType() {
			return ReasonType;
		}
		
		//Select Reason Type
		
		@FindBy(xpath="//option[contains(text(),'Track my order')]")
		public WebElement SelectReasonType;
		
		//Select Reason Type Method
		
		public WebElement getSelectReasonType() {
			return SelectReasonType;
		}
		//Order number
		
		@FindBy (xpath="//input[@id='ctl00_cphContent_txtOrderNo']")
		private WebElement OrderNo;
		
		//Order number method
		
		public WebElement getOrderNo() {
			return OrderNo;
		}
	
}
