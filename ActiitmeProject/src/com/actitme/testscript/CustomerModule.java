package com.actitme.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplements.class)
public class CustomerModule extends BaseClass{
@Test
public void createCustmer() throws IOException, InterruptedException {
	Reporter.log("createCustmer",true);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage tlp=new TaskListPage(driver);
	tlp.getaddnewBtn().click();
	tlp.getnewCustomer().click();
	tlp.getentercusname();
	tlp.getentercusdescrition();
	FileLib f=new FileLib();
	String name = f.getExcelData("Sheet1", 1, 2);
	String des = f.getExcelData("Sheet1", 1, 3);
	tlp.getentercusname().sendKeys(name);
	tlp.getentercusdescrition().sendKeys(des);
	Thread.sleep(5000);
	tlp.getselectcus().click();
	
	tlp.getourcompany().click();
	tlp.getcreatecus().click();
	
}
	
	

}
