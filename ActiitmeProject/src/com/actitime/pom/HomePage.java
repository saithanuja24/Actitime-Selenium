package com.actitime.pom;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	/*@FindBy(id="logoutLink")
	private WebElement lgout;
	
	
	
public void setlogout() {
	lgout.click();
	
}
	*/
@FindBy(id="container_tasks")
private WebElement tasktab;//d
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);//i
}

public void setTaskTab() {//u
	tasktab.click();
}
}
