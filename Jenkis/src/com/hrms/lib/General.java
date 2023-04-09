package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General  extends Global
{
  public void openApp()
  {
	  System.setProperty("webDriver.chrome.driver", "C:\\chrome_drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(url);
	  System.out.println("Open Application");
  }
  
  public void closeApp()
  {
	  driver.close();
	  System.out.println("close Application");
  }
  
  public void login()
  {
	  driver.findElement(By.name(txt_login)).sendKeys(un);
	  driver.findElement(By.name(txt_pass)).sendKeys(pw);
	  driver.findElement(By.name(btn_login)).click();
	  System.out.println("Login Application");
  }
}
