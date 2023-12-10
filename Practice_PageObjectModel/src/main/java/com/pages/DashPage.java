package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashPage {

	@FindBy(xpath="//ul[contains(@class,'sidebar-menu')]/li//span")
	List<WebElement>menus;
	
	public boolean verifymenu() {
		ArrayList<String>actmenu=new ArrayList<String>();
		for(WebElement Menu : menus) {
			String text=Menu.getText().trim();
			actmenu.add(text);
		}
		System.out.println(actmenu);
		ArrayList<String>expmenu=new ArrayList<String>();
		expmenu.add("Dashboard");
		expmenu.add("Users");
		expmenu.add("Operators");
		expmenu.add("Useful Links");
		expmenu.add("Downloads");
		expmenu.add("Logout");
		
		if(actmenu.equals(expmenu)) 
			return true;
	   else 
				return false;
		
}
	public DashPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}

