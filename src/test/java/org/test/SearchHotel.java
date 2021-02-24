package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SearchHotel extends Base{

	public SearchHotel() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement selectLoc;
	
	@FindBy(id="hotels")
	private WebElement selectHot;
	
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	
	@FindBy(id="room_nos")
	private WebElement selectNoRooms;
	
	@FindBy(id="adult_room")
	private WebElement selectAdult;
	
	@FindBy(id="child_room")
	private WebElement selctChild;
	
	@FindBy(id="Submit")
	private WebElement Clicksubmit;

	public WebElement getSelectLoc() {
		return selectLoc;
	}

	public WebElement getSelectHot() {
		return selectHot;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectNoRooms() {
		return selectNoRooms;
	}

	public WebElement getSelectAdult() {
		return selectAdult;
	}

	public WebElement getSelctChild() {
		return selctChild;
	}

	public WebElement getClicksubmit() {
		return Clicksubmit;
	}
	
}
	
