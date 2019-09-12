package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class secondPage extends BaseClass {
	public secondPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	public WebElement loc;
	@FindBy(id = "hotels")
	private WebElement name;
	@FindBy(id = "room_type")
	private WebElement type;
	@FindBy(id = "room_nos")
	private WebElement noRoom;
	@FindBy(id = "datepick_in")
	private WebElement inDate;
	@FindBy(id = "datepick_out")
	private WebElement outDate;
	@FindBy(id = "adult_room")
	private WebElement aduld;
	@FindBy(id = "child_room")
	private WebElement child;
	@FindBy(id = "Submit")
	private WebElement srch;
	
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getNoRoom() {
		return noRoom;
	}
	public WebElement getInDate() {
		return inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getAduld() {
		return aduld;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSrch() {
		return srch;
	}
	
	
	
	
	
	}

