package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderHistory {
	WebDriver driver;

	public orderHistory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//User icon dropdown
	
		//@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/img[1]")
		@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
		private WebElement User_Dropdown_Toggle;
		
			public WebElement getUserDropdown() {
			 return User_Dropdown_Toggle;
			}
		
	//order history
		
		@FindBy(linkText = "Order History")
		private WebElement orderhistoryLink;

		public WebElement orderhistoryLink() {
		return orderhistoryLink;

		}
		
		//Start date field
		
		@FindBy(xpath="//input[@id='ctl00_cphContent_txtStartDate']")
		private WebElement startdatefield;
		
		public WebElement startdatefield() {
			return startdatefield;
		}
		
		//start month text
		
		// @FindBy(xpath="//span[contains(text(),'December')]")
		@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")
		private static WebElement smonthtext;
		
		public WebElement get_smonthtext() {
			return smonthtext;
		}
		
		//start year text
		
		@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")
		private static WebElement syeartext;
		
		public WebElement get_syeartext() {
			return syeartext;
		}
		
public void smonthpage() {
	String smonth="December2019";
	System.out.println("The month is "+get_smonthtext().getText());
	System.out.println("The year is"+get_syeartext().getText());
	String sdate = null;
	while(true) {
		sdate=get_smonthtext().getText()+get_syeartext().getText();
		if(sdate.equals(smonth)) {
			break;
		}
		else
		{
			getPrev().click();
		}
	}
	

}
		
		
			//Start date
		
		@FindBy(xpath="//tbody/tr[1]/td[3]/a[1]")
		private WebElement startdate;
		
		public WebElement getstartdate() {
			return startdate;
		}
		
		
	//End date field
		
		@FindBy(xpath="//input[@id='ctl00_cphContent_txtEndDate']")
		private WebElement enddatefield;
		
		public WebElement enddatefield() {
			return enddatefield;
		}
		
		
		//end month text
		
		@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")
		private static WebElement emonthtext;
		
		public WebElement get_emonthtext() {
			return emonthtext;
		}
		
		
		//end year text
		
		@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")
		private static WebElement eyeartext;
		
		public WebElement get_eyeartext() {
			return eyeartext;
		}
		
		public void emonthpage() {
			String emonth="December2019";
			System.out.println("The month is "+get_emonthtext().getText());
			System.out.println("The year is"+get_eyeartext().getText());
			String edate = null;
			while(true) {
				edate=get_emonthtext().getText()+get_eyeartext().getText();
				if(edate.equals(emonth)) {
					break;
				}
				else
				{
					getPrevEd().click();
				}
			}
			

		}
		
		
		//End date
		
		@FindBy(xpath="//a[contains(text(),'21')]")
		private WebElement enddate;
		
		public WebElement getenddate() {
			return enddate;
		}
		
		//Submit
		
		@FindBy(xpath="//input[@id='ctl00_cphContent_btnFetchOrders']")
		private WebElement submit;
		
		public WebElement submit_btn() {
		return submit;
		}
		
		//startdategreat
		
		@FindBy(xpath="//a[contains(text(),'21')]")
		private WebElement startdategreater;
		
		public WebElement getsdgreater() {
			return startdategreater;
		}
		
		//enddatesmall
		
		@FindBy(xpath="//a[contains(text(),'20')]")
		private WebElement enddatesmaller;
		
		public WebElement getedsmaller() {
			return enddatesmaller;
			
		}
		
		//NextStartDate
		@FindBy(xpath="//span[contains(text(),'Next')]")
		private WebElement nextsd;
		
		public WebElement getNext() {
			return nextsd;
		}
		
		//PrevStartDate
		@FindBy(xpath="//span[contains(text(),'Prev')]")
		private static WebElement prevsd;
		
		public WebElement getPrev() {
			return prevsd;
		}
		
		//PrevEndDate
		
		@FindBy(xpath="//span[contains(text(),'Prev')]")
		private WebElement preved;
		
		public WebElement getPrevEd() {
			return preved;
		}
		
		//NextEndDate
		
		@FindBy(xpath="//span[contains(text(),'Next')]")
		private WebElement nexted;
		
		public WebElement getNextEd() {
			return nexted;
		}
		
		//Links
		@FindBy(xpath="//span[contains(text(),'Account Overview')]")
		private WebElement Accoverview;
		
		public WebElement getAccOvw() {
			return Accoverview;
		}
		
		@FindBy(xpath="//span[contains(text(),'My Profile')]")
		private WebElement profile;
		
		public WebElement getProfile() {
			return profile;
		}
		
		@FindBy(xpath="//span[contains(text(),'My Address Book')]")
		private WebElement AddBk;
		
		public WebElement getAddBk() {
			return AddBk;
		}
		
		@FindBy(xpath="//span[contains(text(),'My Wallet')]")
		private WebElement Wallet;
		
		public WebElement getWallet() {
			return Wallet;
		}
		
		@FindBy(xpath="//span[contains(text(),'Tax Exempt')]")
		private WebElement Tax;
		
		public WebElement getTax() {
			return Tax;
		}
		
		@FindBy(xpath="//span[contains(text(),'My Favorites')]")
		private WebElement Fav;
		
		public WebElement getFav() {
			return Fav;
		}
		
		@FindBy(xpath="//span[contains(text(),'Order History')]")
		private WebElement orderhistory;
		
		public WebElement getOrdHis() {
			return orderhistory;
		}
		
		@FindBy(xpath="//span[contains(text(),'Log Out')]")
		private WebElement Logout;
		
		public WebElement getLogout() {
			return Logout;
		}
		}
