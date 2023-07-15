package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;









public class TaskListPage {
@FindBy(xpath ="//a[.='Open Tasks']" )private WebElement Createtaskmodule;
@FindBy(xpath ="//a[.='Completed Tasks']" )private WebElement completedtaskModule;
@FindBy(xpath ="//a[.='Projects & Customers']" )private WebElement projectsandcustomersModule;
@FindBy(xpath = "//a[.='Archives']")private WebElement archivesmodule;
@FindBy(xpath ="//input[@value='Create New Customer']")private WebElement createNewCustomer;
@FindBy(xpath ="//input[@value='Create New Project']" )private WebElement createNewProject;

@FindBy(xpath ="//*[@name='name']" )private WebElement customerName;
@FindBy(xpath ="//input[@type='submit']")private WebElement submitCustomer;
@FindBy(xpath ="//input[@onclick='cancelCustomerCreation();']" )private WebElement cancelbuttonforcustomer;
@FindBy(xpath ="//*[@name='customerId']" )private WebElement dropdownElement;
@FindBy(xpath ="//*[@name='name']" )private WebElement projectName;
@FindBy(xpath ="//*[@name='createProjectSubmit'] ")private WebElement submitproject;
@FindBy(xpath =" //input[@onclick='cancelProjectCreation();']")private WebElement cancelProjectcreation;


  public TaskListPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }




public WebElement getCreatetaskmodule() {
	return Createtaskmodule;
}


public WebElement getCompletedtaskModule() {
	return completedtaskModule;
}


public WebElement getProjectsandcustomersModule() {
	return projectsandcustomersModule;
}


public WebElement getArchivesmodule() {
	return archivesmodule;
}


public WebElement getCreateNewCustomer() {
	return createNewCustomer;
}


public WebElement getCreateNewProject() {
	return createNewProject;
}


public WebElement getCustomerName() {
	return customerName;
}


public WebElement getSubmitCustomer() {
	return submitCustomer;
}


public WebElement getCancelbuttonforcustomer() {
	return cancelbuttonforcustomer;
}


public WebElement getDropdownElement() {
	return dropdownElement;
}


public WebElement getProjectName() {
	return projectName;
}


public WebElement getSubmitproject() {
	return submitproject;
}


public WebElement getCancelProjectcreation() {
	return cancelProjectcreation;
}
    

public void createnewcustomermethod(String custname) throws InterruptedException

{
	projectsandcustomersModule.click();
	
	createNewCustomer.click();
	customerName.sendKeys(custname);
	Thread.sleep(2000);
	submitCustomer.click();
}
	

  public void CreateNewProjectMethod(int index,String proname) throws InterruptedException 
  {
	  createNewProject.click();
	   Worklib wb = new Worklib();
	  wb.dropDownSelect(dropdownElement,index);
	  projectName.sendKeys(proname);
	  Thread.sleep(2000);
	  submitproject.click();
  }
}

	  
	  
	  
	 
