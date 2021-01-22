package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.lib.General;
import com.utility.Log;

//we are not supposed to use main method in test cases. Always write a function and add annotation

public class TC_hrms_102 {
//	public static void main(String args[]) throws Exception{
	
	General g = new General();
	
	@Test
	public void testcase002() throws Exception {
		
		 //test case steps
		Log.info("*******started execution of testcase002() in TC_hrms_102***********");
		g.openapplication();
		g.login();
		showemplist();	
		g.logout();
		g.closebrowser();
		Log.info("*******end of execution of testcase002() in TC_hrms_102***********");
	
	}
	
	public void showemplist() throws Exception {
		// TODO Auto-generated method stub		
		 Log.info("*******started execution of showemplist() in TC_hrms_102***********");
		Actions action = new Actions(g.driver);
		action.moveToElement(g.driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		
		//clicking on addemployee submenu link
		g.driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on Employee List submenu");
		 Log.info("*******end of execution of showemplist() in TC_hrms_102***********");
	}

}

