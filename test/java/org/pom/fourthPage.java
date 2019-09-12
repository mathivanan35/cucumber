package org.pom;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class fourthPage extends BaseClass {
	public fourthPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement frst_Name;
	@FindBy(id = "last_name")
	private WebElement lst_Name;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement card_No;
	@FindBy(id = "cc_type")
	private WebElement card_Type;
	@FindBy(id = "cc_exp_month")
	private WebElement card_Ex_Mon;
	@FindBy(id = "cc_exp_year")
	private WebElement card_Ex_Year;
	@FindBy(id = "cc_cvv")
	private WebElement card_Cvv;
	@FindBy(id = "book_now")
	private WebElement btn_Book;
	

	
	public WebElement getFrst_Name() {
		return frst_Name;
	}
	public WebElement getLst_Name() {
		return lst_Name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCard_No() {
		return card_No;
	}
	public WebElement getCard_Type() {
		return card_Type;
	}
	public WebElement getCard_Ex_Mon() {
		return card_Ex_Mon;
	}
	public WebElement getCard_Ex_Year() {
		return card_Ex_Year;
	}
	public WebElement getCard_Cvv() {
		return card_Cvv;
	}
	public WebElement getBtn_Book() {
		return btn_Book;
	}
	
	
	

}
