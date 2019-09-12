package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pom.firstPage;
import org.pom.fourthPage;
import org.pom.secondPage;
import org.pom.thirdPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Snip extends BaseClass {
	
	firstPage page;
	secondPage page1;
	thirdPage page2;
	fourthPage page3;
	
	@Given("^LoginPage$")
	public void loginpage() throws Exception {
		WebDriver driver = getDriver();
		loadUrl("https://www.adactin.com/HotelApp/");
	}

	@When("^Enter the \"([^\"]*)\",\"([^\"]*)\" on the login page$")
	public void enter_the_on_the_login_page(String arg1, String arg2) throws Exception {
		 page = new firstPage();
		type(page.getTxtUser(), arg1);
		type(page.getTxtpass(), arg2);
	}

	@Then("^Click Login button$")
	public void click_Login_button() throws Exception {
		 page = new firstPage();
		btn(page.btnClk);
	}

	@Then("^Enter the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"on the particular field$")
	public void enter_the_on_the_particular_field(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String arg7, String arg8) throws Exception {
		 page1 = new secondPage();
		type(page1.getLoc(), arg1);
		type(page1.getName(), arg2);
		type(page1.getType(), arg3);
		type(page1.getNoRoom(), arg4);
		type(page1.getInDate(), arg5);
		type(page1.getOutDate(), arg6);
		type(page1.getAduld(), arg7);
		type(page1.getChild(), arg8);
	}

	@Then("^Click the search button$")
	public void click_the_search_button() throws Exception {
		 page1 = new secondPage();
		btn(page1.getSrch());
	}

	@Then("^Select hotel$")
	public void select_hotel() throws Exception {
		 page2 = new thirdPage();
		btn(page2.getBtn_Radio());
	}

	@Then("^Click the Continue button$")
	public void click_the_Continue_button() throws Exception {
		 page2 = new thirdPage();
		btn(page2.getClk_Conti());
	}

	@Then("^enter the personalInfo \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" on the particular field$")
	public void enter_the_personalinfo_somethingsomethingsomethingsomethingsomethingsomethingsomethingsomething_on_the_particular_field(
			String firstname, String lastname, String address, String cardno, String cardtype, String exdate,
			String exyear, String cvv) throws Throwable {
		 page3 = new fourthPage();
		type(page3.getFrst_Name(), firstname);
		type(page3.getLst_Name(), lastname);
		type(page3.getAddress(), address);
		type(page3.getCard_No(), cardno);
		type(page3.getCard_Type(), cardtype);
		type(page3.getCard_Ex_Mon(), exdate);
		type(page3.getCard_Ex_Year(), exyear);
		type(page3.getCard_Cvv(), cvv);
	}

	@Then("^click the BookNow Button$")
	public void click_the_BookNow_Button() throws Exception {
		 page3 = new fourthPage();
		btn(page3.getBtn_Book());
	}
}
