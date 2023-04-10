package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class General  extends Global
{
  public void openApp() throws Exception
  {
	  System.setProperty("webDriver.chrome.driver", "C:\\chrome_drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(url);
	  System.out.println("Open Application");
  }
  
  public void closeApp() throws Exception
  {
	  driver.close();
	  System.out.println("close Application");
  }
  
  public void login() throws Exception
  {
	  driver.findElement(By.name(txt_login)).sendKeys(un);
	  driver.findElement(By.name(txt_pass)).sendKeys(pw);
	  driver.findElement(By.name(btn_login)).click();
	  System.out.println("Login Application");
  }
	  public void enterFrame() throws Exception
	  {
		 driver.switchTo().frame(frame_enter);
		  System.out.println("Entered into the frame");	
		 
	  }
	  
	  public void exitFrame() throws Exception
	  {
		  driver.switchTo().defaultContent();
		  System.out.println("Exit into frame");
	  }
	  public void addNewEmp() throws Exception
	  {
		  driver.findElement(By.xpath(btn_add)).click();
		  Thread.sleep(1000);
		  driver.findElement(By.name(emp_Lastname)).sendKeys("Shankar");
		  Thread.sleep(1000);
		  driver.findElement(By.name(emp_FirstName)).sendKeys("Bhosle");
		  Thread.sleep(1000);
		  driver.findElement(By.id(btn_save)).click();
		  System.out.println("Add  new Emp");
		  Thread.sleep(1000);
	  }
	  
	  public void searchEmp() throws Exception
	  {
		  driver.switchTo().frame(0);
		  Actions ac= new Actions(driver);
		 ac.moveToElement(driver.findElement(By.linkText(pim))).perform();
		//  driver.findElement(By.linkText("Employee List")).sendKeys("Employee List");;
		  driver.findElement(By.linkText("Employee List")).click();
		  driver.switchTo().defaultContent();
		  System.out.println("click on emp list");
		  Select sc = new Select(driver.findElement(By.id(srch_bar)));
		  sc.selectByValue("1");
		  Thread.sleep(2000);
		  driver.findElement(By.name(serarch)).sendKeys("7915");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(btn_search)).click();
		  Thread.sleep(1000);
		  System.out.println("search emp successfully");
		  driver.findElement(By.xpath(btn_delete)).click();
		  System.out.println("Delete emp successfully");
		  
	  }
 
  
}
