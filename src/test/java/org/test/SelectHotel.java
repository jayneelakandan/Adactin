package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SelectHotel extends Base{
public SelectHotel() {
PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")	
private WebElement selectHotel;

@FindBy(id="continue")
private WebElement clickContinue;

public WebElement getSelectHotel() {
	return selectHotel;
}

public WebElement getClickContinue() {
	return clickContinue;
}	
	
	
	
	
	
	
}
