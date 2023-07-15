package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomerListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskListPage;
import pagePackage.UserListPage;
@Listeners(CustomerListener.class)
public class ValidLoginTestCase extends BaseTest {

	@Test
	public void validTestCase() throws IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
        Thread.sleep(2000);
        HomePage hp = new HomePage(driver);
        hp.usersModuleMethod();
        Thread.sleep(2000);
        UserListPage ulp = new UserListPage(driver);
        ulp.createUserMethod(flib.readExceldata(EXCEL_PATH,"mgr",1,0), flib.readExceldata(EXCEL_PATH,"mgr",1,1),flib.readExceldata(EXCEL_PATH,"mgr",1,2),flib.readExceldata(EXCEL_PATH,"mgr",1,3));
		ulp.selectCheckBox();
		ulp.managerCreateMethod();
		Thread.sleep(2000);
		hp.taskModuleMethod();
		TaskListPage task = new TaskListPage(driver);
		task.createnewcustomermethod(flib.readExceldata(EXCEL_PATH,"customer&projectList",1,0));
		Thread.sleep(2000);
		task.CreateNewProjectMethod(0,flib.readExceldata(EXCEL_PATH,"customer&projectList",1,1));

	}

}