package com.UI.ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen {
	WebDriver driver;
    public HomeScreen(WebDriver driver){

        this.driver = driver;

    }

    public By login = By.xpath("//*[text()='About']");	
	
}
