package com.testscripts;

import org.testng.annotations.Test;

import com.lib.General;
import com.utility.Log;

// we are not supposed to use main method in test cases. Always write a function and add annotation

public class TC_hrms_101 {

//	public static void main(String args[]) throws Exception{
	
	@Test
	public void testcase001() throws Exception{
		 Log.info("*******started execution of testcase001() in TC_hrms_101***********");
		General g = new General();
		 //test case steps
		g.openapplication();
		g.login();
		g.addemp();
		g.delmp();
		g.logout();
		g.closebrowser();
		 Log.info("*******end execution of testcase001() in TC_hrms_101***********");
			}
		}
