package org.test;

import org.openqa.selenium.WebDriver;

public class day2 extends BaseClass{
	public static void main(String[] args) {
		
		WebDriver driver=chromeBrower();
		urllaunch("https://www.facebook.com/login/");
		implicitlyWait(20);
		
	}

}
