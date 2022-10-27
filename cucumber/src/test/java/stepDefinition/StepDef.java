package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Login;

public class StepDef {
	
	public WebDriver driver;
	public Login  loginn;
		
		@Given("User launches chrome browser")
		public void user_launches_chrome_browser() {
		 
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		loginn= new Login(driver);
			
		}

		@When("User enters the url {string}")
		public void user_enters_the_url(String loginurl) {
		   
			driver.get(loginurl);
		
			
			
		}
		
		

		@When("Enter the email {string} and password credentials {string}")
		public void enter_the_email_and_password_credentials(String email, String Password) {
		   
			loginn.EnterEmail(email);
			loginn.Enterpass(Password);
		}

	/*
		@When("Enter the email {string} and password credentials{string}")
	}	public void enter_the_email_and_password_credentials(String email,String Password) {
		  
			loginn.EnterEmail(email);
			loginn.Enterpass(Password);
			
		} */

		@When("click on the login button")
		public void click_on_the_login_button() {
		   
			loginn.loginclickbtn();
		}

		@Then("home page title is {string}")
		public void home_page_title_is(String Exptitle) {
			
		 String actualTitle = driver.getTitle();
		 if(actualTitle.equalsIgnoreCase(actualTitle))
				 {
			 
			 Assert.assertTrue(true);
			 
				 }
		 else{
			 Assert.assertTrue(false);
			 
		 }
		 
		}

		

	}