package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class project1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Mega");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
	}

}
