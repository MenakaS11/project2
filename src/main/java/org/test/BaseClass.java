package org.test;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	  public static WebDriver driver;
	public static WebDriver chromeBrower() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		return driver;
		
	}
	public static WebDriver EdgerBrowser() {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		return driver;
		
	}
	
	public static WebDriver FriefoxBrowseer() {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		return driver;
	}
	
	public static void urllaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
		
		
	}
	
	public static void sendKeys(WebElement e,String a) {
		e.sendKeys(a);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
 public static String getCurrentUrl() {
	 String currentUrl = driver.getCurrentUrl();
	 return currentUrl;
}
 public static String getTitle() {
	String title = driver.getTitle();
	return title;
}
 
 public static void quit() {
	driver.quit();
}
 
 public static void clear(WebElement e) {
	e.clear();
}
 
 public static String gettext(WebElement e) {
	String text=e.getText();
	return text;
}
 
 public static String getAttribute(WebElement e) {
	String attribute=e.getAttribute("value");
	return attribute;
}
 public static String getAttribute1(WebElement e) {
	String attirbut=e.getAttribute("inner Text");
	return attirbut;
}
 
 public static void dragAndDrop(WebElement src, WebElement dest) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, dest).perform();
}
 
 public static void moveToElement(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
}
 public static void click() {
	Actions a=new Actions(driver);
	a.click().perform();
}
 
 public static void clickAndHold() {
	Actions a=new Actions(driver);
	a.clickAndHold().perform();
}
 
 public static void contextClick() {
	Actions a=new Actions(driver);
	a.contextClick().perform();
}
 
 public static void contextClick(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).perform();
}
 
 public static void doubleClick() {
	Actions a=new Actions(driver);
	a.doubleClick().perform();
}
 
public static void doubleClick(WebElement e) {
	Actions a=new Actions(driver);
	a.doubleClick(e).perform();
} 
 
public static void selectByIndex(WebElement e,int a) {
	Select s=new Select(e);
	s.selectByIndex(a);
}


public static void selectByValue(WebElement e,String a) {
	Select s=new Select(e);
	s.selectByValue(a);
}

public static void selectByVisibleText(WebElement e,String a) {
	Select s=new Select(e);
	s.selectByVisibleText(a);
}
public static void  alert(){
	driver.switchTo().alert();
}

public static void defaultContent() {
	driver.switchTo().defaultContent();
}

public static void frame(int a) {
	driver.switchTo().frame(a);
}


	







 
 
 
 
 
 
 
 
 
 
}
