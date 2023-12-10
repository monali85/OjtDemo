package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashPage;

public class DashTest {
WebDriver driver=null;
DashPage dp=null;

@BeforeSuite
public void setup() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/selenium%20software/Offline%20Website/pages/examples/dashboard.html");
	driver.manage().window().maximize();
	dp=new DashPage(driver);
}
@Test
public void Dashtest() {
	boolean flag=dp.verifymenu();
	Assert.assertTrue(flag);
}
}
