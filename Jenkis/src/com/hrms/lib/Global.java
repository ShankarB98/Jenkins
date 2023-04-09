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

	
	//Add New EMp
	public String frame_enter = "rightMenu";
	public String btn_add = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String emp_Lastname= "txtEmpLastName";
	public String emp_FirstName = "txtEmpFirstName";
	public String btn_save = "btnEdit";
}
