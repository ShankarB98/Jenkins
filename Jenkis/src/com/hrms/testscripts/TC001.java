package com.hrms.testscripts;


import com.hrms.lib.*;
public class TC001 {

	public static void main(String[] args) {
		
		General gn = new General();
		gn.openApp();
		gn.login();
		gn.closeApp();

	}

}
