package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class firstPage extends BaseClass {
	public firstPage() {
	PageFactory.initElements( driver,this);
	}
	
	@FindBy(id="username")
	private WebElement txtUser;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	public WebElement btnClk;
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnClk() {
		return btnClk;
	}	
	
	
	
	
	
}
