package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement entercusname;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercusdescrition;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[1]")
	private WebElement selectcus;
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcompany;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcus;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getaddnewBtn() {
		return addnewBtn;
		
	}
	public WebElement getnewCustomer() {
		return newCustomer;
	}
	public WebElement getentercusname() {
		return entercusname;
		
	}
	public WebElement getentercusdescrition() {
		return entercusdescrition;
	}
	public WebElement getselectcus() {
		return selectcus;
	}
	public WebElement getourcompany() {
		return ourcompany;
	}
	public WebElement getcreatecus() {
		return createcus;
	}
	
	}