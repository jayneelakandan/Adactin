package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{
	
public LoginPage() {
PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private	WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getTxtUserName() {
		return txtUserName;
	}
//neelakandan is a Goodboy and he is going to America very soon
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
