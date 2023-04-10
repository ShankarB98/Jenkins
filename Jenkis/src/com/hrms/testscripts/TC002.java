package com.hrms.testscripts;


import com.hrms.lib.General ;
public class TC002 
{
	public static void main(String[] args) throws Exception {
		
	
		General gn = new General();
		gn.openApp();
		gn.login();
		gn.enterFrame();
		gn.addNewEmp();
		gn.exitFrame();
		gn.closeApp();
	}

}
