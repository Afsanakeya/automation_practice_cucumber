package com.orange_hrm.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Repo {
WebDriver driver;
	public Object_Repo(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//*[@id='txtUsername']")
	private WebElement user_name_field;

	public WebElement getUser_name_field() {
		return user_name_field;
	}
	
	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement password_field;
	
	public WebElement getPassword_field() {
		return password_field;
	}
	
	@FindBy (id="btnLogin")
	private WebElement log_in_button;

	public WebElement getLog_in_button() {
		return log_in_button;
	}
	@FindBy(xpath="//*[@id='menu_dashboard_index']/b")
	private WebElement Dashboard;
	public WebElement getDashboard() {
		return Dashboard;
	}
}