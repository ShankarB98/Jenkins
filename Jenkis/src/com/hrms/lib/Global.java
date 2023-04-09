package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
	//testdata
	public String url = "http://183.82.103.245/nareshit/index.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	
	//ObjData
	
	public String txt_login = "txtUserName";
	public String txt_pass = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";

}
