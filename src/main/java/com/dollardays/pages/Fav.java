package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fav {
	WebDriver driver;

	public Fav(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//User icon dropdown
		
		//@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]/img[1]")
		@FindBy(xpath="//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
		private WebElement User_Dropdown_Toggle;
		
	//User icon Method	
		
		public WebElement getUserDropdown() {
			 return User_Dropdown_Toggle;
			}

		//Favourites
		
		@FindBy(xpath="//a[contains(text(),'Favorites')]")
		private WebElement favourite;
		
		public WebElement fav_link() {
			return favourite;
		}
		
		//Dropdown
		
		@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
		private WebElement sortby;
		
		public WebElement get_sortby() {
			return sortby;
		}
		
		//@FindBy(xpath="//body/form[@id='aspnetForm']/div[6]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
		@FindBy(xpath="//option[contains(text(),'12')]")
		private WebElement view;
		
		public WebElement get_view() {
			return view;
		}
		
		//Page navigation
		
		@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[5]/a[1]/i[1]")
		private WebElement next;
		
		public WebElement get_next() {
			return next;
		}
		
		//Add to cart
		@FindBy(xpath="//body/form[@id='aspnetForm']/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[5]")
		private WebElement addtocart;
		
		public WebElement get_addtocart() {
			return addtocart;
		}
		
		//Cart
		@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/div[1]/a[1]/img[1]")
		private WebElement cart;
		
		public WebElement get_cart() {
			return cart;
		}
		
		//Update cart more
		@FindBy(xpath="//body/form[@id='aspnetForm']/div[6]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/img[1]")
		private WebElement updatecartmore;
		
		public WebElement updatecart_more() {
			return updatecartmore;
		}
		
		//Update cart less
		@FindBy(xpath="//body/form[@id='aspnetForm']/div[6]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/img[1]")
		private WebElement updatecartless;
		
		public WebElement updatecart_less() {
			return updatecartless;
			
		}
		
		//Update
		@FindBy(xpath="//body/form[@id='aspnetForm']/div[6]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/span[1]/a[1]")
		private WebElement update;
		
		public WebElement get_update() {
			return update;
		}
}

