package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SubmitReq {
	WebDriver driver;

	public SubmitReq(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Submit a request')]")
	private WebElement submitequesttext;

	public WebElement getrequesttext()
	{
	return submitequesttext;
	}
	
	
	
//User icon dropdown
	
	//@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
	private WebElement User_Dropdown_Toggle;
	
//User icon Method	
	
	public WebElement getUserDropdown() {
		 return User_Dropdown_Toggle;
		}
	
//Submit a Request link
	
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
	
	@FindBy(xpath="//select[@id='ctl00_cphContent_drpReason']")
	public WebElement ReasonType;
	
	// Reason Type Dropdown Method
	
	public WebElement getReasonType() {
		return ReasonType;
	}
	
	//Select Reason Type
	
	//@FindBy(xpath="//option[contains(text(),'Track my order')]")
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
	
//Message
	
	@FindBy(xpath="//textarea[@id='ctl00_cphContent_txtNote']")
	public WebElement Message;
	
	//Message Method
	
	public WebElement getMessage() {
		return Message;
		
	}
	
	//Robot checkbox
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	public WebElement checkbox;
	
	//Robot Method
	public WebElement checkbox_click() {
		return checkbox;
	}
	
	
	//Submit
	
	@FindBy(xpath="//input[@id='ctl00_cphContent_btnCreate']")
	public WebElement SubmitBtn;
	
	//Submit Method
	
	public WebElement SubmitBtn_click() {
		return SubmitBtn;

	}
	
	//Submit Message
	
	//@FindBy(xpath="//div[contains(text(),'Case created successfully.')]")
	//public Boolean SubmitMessage;
	
	//Submit Message Method
	
	//public Boolean getSubmitMessage() {
	//	return SubmitMessage;
	//}
	
	//Reason Type
	
	@FindBy(xpath="//div[contains(text(),'Please select reason.')]")
	public WebElement SubmitMessage;
	
	//Reason type method
	
	public WebElement getSubmitMsg() {
		return SubmitMessage;
	}
	

	
	
	
	/*public void Submit() throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
		
		Thread.sleep(1000);
		getUserDropdown().click();
		Thread.sleep(1000);
		submitARequestLink().click();
		Thread.sleep(1000);
		getEmailid().sendKeys("srikanthtesting100@gmail.com");
		Thread.sleep(1000);
		getPhoneNumber().sendKeys("1234567890");
		Thread.sleep(1000);
		getReasonType().click();
		Thread.sleep(1000);
		getSelectReasonType().click();
		Thread.sleep(1000);
		getOrderNo().sendKeys("12345");
		Thread.sleep(1000);
		getMessage().sendKeys("Hi");
		Thread.sleep(1000);
		checkbox_click().click();
		Thread.sleep(1000);
		SubmitBtn_click().click();
		String expectedTitle = ("Please select a reason.");
        String actualTitle = submitreq.getSubmitMsg();
        Assert.assertEquals(actualTitle, expectedTitle, " Please select a reason.");
	
	
	
}*/
}
