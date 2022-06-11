package org.cts.test.prog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage extends BaseClass {
	

	public FBLoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@title='English (UK)']")
	public WebElement English;
	
	@FindBy(id="email")
	WebElement Username;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	
	@FindBy(id="u_0_2_NS")
	WebElement CreateNew;


	public WebElement getEnglish() {
		return English;
	}


	public WebElement getUsername() {
		return Username;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getCreateNew() {
		return CreateNew;
	}
}
