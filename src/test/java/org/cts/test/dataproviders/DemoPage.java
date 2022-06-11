package org.cts.test.dataproviders;

import org.cts.test.prog.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage extends BaseClass {
	
	public DemoPage() {
		
	PageFactory.initElements(driver, this);
	
	}
		@FindBy(id="email")
		WebElement email;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		WebElement firstname;
		
		@FindBy(xpath="//input[@placeholder='Last Name']")
		WebElement lastname;
		
		@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-valid ng-touched']")
		WebElement address;
		
		
		@FindBy(xpath="//input[@type='email']")
		WebElement emailid;
		
		@FindBy(xpath="//input[@type='tel']")
		WebElement phone;
		 
		@FindBy(id="firstpassword")	
		WebElement password;

		public WebElement getEmail() {
			return email;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getEmailid() {
			return emailid;
		}

		public WebElement getPhone() {
			return phone;
		}

		public WebElement getPassword() {
			return password;
		}		
}
