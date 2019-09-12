package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class thirdPage extends BaseClass {
	public thirdPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement btn_Radio;
	@FindBy(id="continue")
	private WebElement clk_Conti;
	
	
	public WebElement getBtn_Radio() {
		return btn_Radio;
	}
	public WebElement getClk_Conti() {
		return clk_Conti;
	}
	
	
	
	
	
}
