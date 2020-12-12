package com.orange_hrm_step_def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange_hrm.base.Base;
import com.orange_hrm.repo.Object_Repo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def {
	WebDriver driver;
	Object_Repo op;
	@Given("^User on home page$")
	public void user_on_home_page() throws Throwable {
		driver=Base.getBrowser(driver, "chrome");
		driver.get(Base.getUrl());
		op=PageFactory.initElements(driver, Object_Repo.class);

	}

	@When("^User enters user name in user name filed\"([^\"]*)\"$")
	public void user_enters_user_name_in_user_name_filed(String username) throws Throwable {
		op.getUser_name_field().sendKeys(username);

	}

	@When("^User enters password in password filed\"([^\"]*)\"$")
	public void user_enters_password_in_password_filed(String password) throws Throwable {
		op.getPassword_field().sendKeys(password);

	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		try{op.getLog_in_button().click();

		}
		catch(Exception e ) {System.out.println("User unable to click on login button" +e);
		}
	}
	@Then("^User should sucessfully login and dashboard should display$")
	public void user_should_sucessfully_login_and_dashboard_should_display() throws Throwable {
		try{
			op.getDashboard().isDisplayed();
			System.out.println("Dashboard is displayed");
		}

		catch(Exception e){
			System.out.println("Dashboard is not displayed" +e);
		}
	}

	@Then("^Wait for \"([^\"]*)\" seconds$")
	//And Wait for "10" seconds
	public void wait_for_seconds(int seconds) throws Throwable {
		int wait=1000;
		wait *= seconds;
		Thread.sleep(wait);
		System.out.println("Waiting for "+seconds+" seconds");
	}

}
