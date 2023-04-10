package com.hrms.lib;

import java.util.concurrent.TimeUnit;

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
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
	  public void addNewEmp()
	  {
		  driver.findElement(By.xpath(btn_add)).click();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.name(emp_Lastname)).sendKeys("Shankar");
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.name(emp_FirstName)).sendKeys("Bhosle");
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.id(btn_save)).click();
		  System.out.println("Add  new Emp");
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  }
	  
	  public void searchEmp() throws Exception
	  {
		 
		 
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
