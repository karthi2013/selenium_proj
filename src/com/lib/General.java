package com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;

// Reusable functions -- in General.java we should not use any annotations

public class General extends Global {
	
	  public void openapplication(){
		  Log.info("*******started execution***********");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunan\\Desktop\\COVID_Resume\\testing\\automation selenium webdriver\\selenium and browser downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.navigate().to(url);
		Log.info("*****Application Opened Successfully*****");
	   }
	
		public void closebrowser(){
		driver.quit();
		Log.info("****Application close successfully****");
		Log.info("*******End execution***********");
		}
		
		public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		}
		
		public void logout() throws Exception{
			
			driver.findElement(By.id(welcome)).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText(link_logout)).click(); 
		}
		
		
		public void addemp(){
		System.out.println("adding new emp"); 
		}
		
		
		public void delmp(){
		System.out.println("delete emp"); 
		}
		/*
		 * public void showemplist() throws Exception{ Actions action = new
		 * Actions(driver);
		 * action.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		 * Thread.sleep(3000);
		 * 
		 * //clicking on addemployee submenu link
		 * driver.findElement(By.linkText("Employee List")).click(); Thread.sleep(3000);
		 * System.out.println("Clicked on Employee List submenu"); }
		 */
}
