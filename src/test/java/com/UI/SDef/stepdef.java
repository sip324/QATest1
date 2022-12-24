package com.UI.SDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.UI.ObjRepo.HomeScreen;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef {
WebDriver driver;
	@Given("User open the browser")
	public void user_open_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}
	@Given("user has link to google")
	public void user_has_link_to_google() {
	    driver.get("https://www.google.co.in/");
	    
	}	HomeScreen hs = new HomeScreen(driver);

	@When("user clicks on About link on home screen")
	public void user_clicks_on_about_link_on_home_screen() {
	    //driver.findElement(By.xpath("//*[text()='About']")).click();
		driver.findElement(hs.login);

	}
	@Then("User enters the corresponding screen")
	public void user_enters_the_corresponding_screen() {
	    
	    System.out.println(driver.getTitle());
	}



}
