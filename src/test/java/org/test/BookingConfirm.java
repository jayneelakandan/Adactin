package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BookingConfirm extends Base {
public BookingConfirm() {
PageFactory.initElements(driver, this);
}

@FindBy(id="hotel_name")
private WebElement txtHotelName;

@FindBy(id="location")
private WebElement txtlocation;

@FindBy(id="room_type")
private WebElement txtroomtype;


@FindBy(id="arrival_date")
private WebElement txtarrivaldate;

@FindBy(id="departure_text")
private WebElement txtdeparture_text;

@FindBy(id="total_rooms")
private WebElement txtTotalRooms;

@FindBy(id="adults_room")
private WebElement txtadultsroom;

@FindBy(id="children_room")
private WebElement txtChildRoom;

@FindBy(id="price_night")
private WebElement txtPrice;

@FindBy(id="total_price")
private WebElement txtTotalPrice;

@FindBy(id="gst")
private WebElement txtGST;

@FindBy(id="final_price")
private WebElement txtFinalPrice;

@FindBy(id="first_name")
private WebElement txtFirstName;

@FindBy(id="last_name")
private WebElement txtLastName;

@FindBy(id="address")
private WebElement txtAddress;

@FindBy(id="order_no")
private WebElement txtOrderNo;

public WebElement getTxtHotelName() {
	return txtHotelName;
}

public WebElement getTxtlocation() {
	return txtlocation;
}

public WebElement getTxtroomtype() {
	return txtroomtype;
}

public WebElement getTxtarrivaldate() {
	return txtarrivaldate;
}

public WebElement getTxtdeparture_text() {
	return txtdeparture_text;
}

public WebElement getTxtTotalRooms() {
	return txtTotalRooms;
}

public WebElement getTxtadultsroom() {
	return txtadultsroom;
}

public WebElement getTxtChildRoom() {
	return txtChildRoom;
}

public WebElement getTxtPrice() {
	return txtPrice;
}

public WebElement getTxtTotalPrice() {
	return txtTotalPrice;
}

public WebElement getTxtGST() {
	return txtGST;
}

public WebElement getTxtFinalPrice() {
	return txtFinalPrice;
}

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getTxtAddress() {
	return txtAddress;
}

public WebElement getTxtOrderNo() {
	return txtOrderNo;
}


}
