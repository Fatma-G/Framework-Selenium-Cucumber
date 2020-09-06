package com.e2eTest.Automation.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommunMethods {

	public static WebDriver driver;

	public CommunMethods() {

		driver = Setup.driver;
	}
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public static void scrollerBotton() {
		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}
	}

	public void scrollerTop() {

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(" + 0 + "," + 0 + ")", "");
	}

	public void refreshBrowser() {
		driver.navigate().refresh();
	}

	public void goBack() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}
}
