package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;

public class TestCase extends Base{
	
Base b=new Base();
@BeforeClass	
@Parameters({"user","pass"})
private void tc0(String userName, String passWord) {
driver=b.getDriver();
b.getUrl("http://adactinhotelapp.com/");
driver.manage().window().maximize();
LoginPage l=new LoginPage();
WebElement txtUserName = l.getTxtUserName();
b.sendKey(txtUserName, userName);
WebElement txtPassword = l.getTxtPassword();
b.sendKey(txtPassword, passWord);
WebElement login = l.getLogin();
b.click(login);

}	
@Test
private void tc1() {
SearchHotel s=new SearchHotel();
WebElement selectLoc = s.getSelectLoc();
b.selectByInd(selectLoc, 2);
WebElement selectHot = s.getSelectHot();
b.selectByInd(selectHot, 2);
WebElement selectRoomType = s.getSelectRoomType();
b.selectByInd(selectRoomType, 2);
WebElement selectNoRooms = s.getSelectNoRooms();
b.selectByInd(selectNoRooms, 2);
WebElement selectAdult = s.getSelectAdult();
b.selectByInd(selectAdult, 2);
WebElement selctChild = s.getSelctChild();
b.selectByInd(selctChild, 1);
WebElement clicksubmit = s.getClicksubmit();
b.click(clicksubmit);

}

@Test
private void tc2() {
SelectHotel s1=new SelectHotel();
WebElement selectHotel = s1.getSelectHotel();
b.click(selectHotel);
WebElement clickContinue = s1.getClickContinue();
b.click(clickContinue);

}
@Test
@Parameters({"fname","lname","Billaddress","ccno","cvv"})
	private void tc3(String fnam,String lnam,String address,String cardno,String cvv) {
	BookHotel bh=new BookHotel();
	WebElement getfName = bh.getfName();
	b.sendKey(getfName, fnam);
	WebElement lname = bh.getLname();
	b.sendKey(lname, lnam);
	WebElement address2 = bh.getAddress();
	b.sendKey(address2, address);
	WebElement creditcardNumber = bh.getCreditcardNumber();
	b.sendKey(creditcardNumber, cardno);
	WebElement creditcardType = bh.getCreditcardType();
	b.selectByInd(creditcardType, 1);
	WebElement ccExpMonth = bh.getCcExpMonth();
	b.selectByInd(ccExpMonth, 2);
	WebElement ccExpYear = bh.getCcExpYear();
	b.selectByVisibletext(ccExpYear, "2021");
	WebElement cvv2 = bh.getCvv();
	b.sendKey(cvv2, cvv);
	WebElement btnBookNow = bh.getBtnBookNow();
	b.click(btnBookNow);
	}


@AfterClass
@Parameters({"loc","sname","celnum"})
private void tc4(String loc,String SheetName,int cellNumber) throws Exception {
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
BookingConfirm bc=new BookingConfirm();
WebElement txtHotelName = bc.getTxtHotelName();
String attribut = b.getAttribut(txtHotelName);
b.excelWrite(loc, SheetName, attribut, 0, cellNumber);
//
WebElement txtlocation = bc.getTxtlocation();
String attribut2 = b.getAttribut(txtlocation);
b.excelUpdate(loc, SheetName, attribut2, 1, cellNumber);

WebElement txtroomtype = bc.getTxtroomtype();
String attribut3 = bc.getAttribut(txtroomtype);
b.excelUpdate(loc, SheetName, attribut3, 2, cellNumber);

WebElement txtarrivaldate = bc.getTxtarrivaldate();
String attribut4 = b.getAttribut(txtarrivaldate);
b.excelUpdate(loc, SheetName, attribut4, 3, cellNumber);

WebElement txtdeparture_text = bc.getTxtdeparture_text();
String attribut5 = b.getAttribut(txtdeparture_text);
b.excelUpdate(loc, SheetName, attribut5, 4, cellNumber);

WebElement txtTotalRooms = bc.getTxtTotalRooms();
String attribut6 = b.getAttribut(txtTotalRooms);
b.excelUpdate(loc, SheetName, attribut6, 5, cellNumber);

WebElement txtadultsroom = bc.getTxtadultsroom();
String attribut7 = b.getAttribut(txtadultsroom);
b.excelUpdate(loc, SheetName, attribut7, 6, cellNumber);

WebElement txtChildRoom = bc.getTxtChildRoom();
String attribut8 = b.getAttribut(txtChildRoom);
b.excelUpdate(loc, SheetName, attribut8, 7, cellNumber);

WebElement txtPrice = bc.getTxtPrice();
String attribut9 = b.getAttribut(txtPrice);
b.excelUpdate(loc, SheetName, attribut9, 8, cellNumber);

WebElement txtTotalPrice = bc.getTxtTotalPrice();
String attribut12 = b.getAttribut(txtTotalPrice);
b.excelUpdate(loc, SheetName, attribut12, 9, cellNumber);


WebElement txtGST = bc.getTxtGST();
String attribut11 = b.getAttribut(txtGST);
b.excelUpdate(loc, SheetName, attribut11, 10, cellNumber);

WebElement txtFinalPrice = bc.getTxtFinalPrice();
String attribut10 = b.getAttribut(txtFinalPrice);
b.excelUpdate(loc, SheetName, attribut10, 11, cellNumber);

WebElement txtFirstName = bc.getTxtFirstName();
String attribut13 = b.getAttribut(txtFirstName);
b.excelUpdate(loc, SheetName, attribut13, 12, cellNumber);

WebElement txtLastName = bc.getTxtLastName();
String attribut14 = b.getAttribut(txtLastName);
b.excelUpdate(loc, SheetName, attribut14, 13, cellNumber);

WebElement txtAddress = bc.getTxtAddress();
String attribut15 = b.getAttribut(txtAddress);
b.excelUpdate(loc, SheetName, attribut15, 14, cellNumber);

WebElement txtOrderNo = bc.getTxtOrderNo();
String attribut16 = b.getAttribut(txtOrderNo);
b.excelUpdate(loc, SheetName, attribut16, 15, cellNumber);

b.quit();
}
}
