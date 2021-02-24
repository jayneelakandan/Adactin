package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BookHotel extends Base{
public BookHotel() {
PageFactory.initElements(driver, this);
}
	@FindBy(id="first_name")
	private WebElement fName;
	
	@FindBy(id="last_name")
	private WebElement Lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement creditcardNumber;
	
	@FindBy(id="cc_type")
	private WebElement creditcardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	public WebElement getfName() {
		return fName;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardNumber() {
		return creditcardNumber;
	}

	public WebElement getCreditcardType() {
		return creditcardType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
}
