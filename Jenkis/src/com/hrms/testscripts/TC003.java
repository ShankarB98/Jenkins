package com.hrms.testscripts;

import com.hrms.lib.*;
public class TC003 {

	public static void main(String[] args) throws Exception {
		General gn = new General();
		gn.openApp();
		gn.login();
		gn.enterFrame();
		gn.addNewEmp();
		gn.exitFrame();
		gn.searchEmp();
		gn.closeApp();

	}

}
