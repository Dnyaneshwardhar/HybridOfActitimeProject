package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Worklib extends BaseTest {

	 public void acceptalert(){
		 driver.switchTo().alert().accept();
		 
	 }
	 public void dismissalert()
	 {
		 driver.switchTo().alert().dismiss();
	 }
	 public void acceptconfirmation()
	 {
		 driver.switchTo().alert().accept();
	 }
	 public void dismissconfirmation()
	 {
		 driver.switchTo().alert().dismiss();
	 }
	 
	 public void rightClick(WebElement target)
     {
		 Actions ac = new Actions(driver);
		 ac.contextClick(target).perform();
		 
     }
	   public void doubleclick(WebElement target)
	   {
		   Actions ac = new Actions(driver);
		   ac.doubleClick(target).perform();
	   }
	   public void mouseHover(WebElement target)
	   {
		   Actions ac = new Actions(driver);
		    ac.moveToElement(target).perform();
	   }
       public void draganddrop(WebElement src,WebElement target)
       {
    	   Actions ac = new Actions(driver);
    	   ac.dragAndDrop(src, target).perform();
       }
       public void handleframebyindex(int index)
       {
    	   driver.switchTo().frame(index);
       }
       public void handleframebynameorid(String nameorid)
       {
    	   driver.switchTo().frame(nameorid);
       }
       public void handleframebyframeelement(WebElement frame)
       {
    	   driver.switchTo().frame(frame);
       }
       public void handleframebyparent() {
       
    	   driver.switchTo().parentFrame();
       }
       public void handledefaultcontent()
       {
    	   driver.switchTo().defaultContent();
       }
	public void dropDownSelect(WebElement Element, int index) {
	        Select sel = new Select(Element);
	        sel.selectByIndex(index);
		
	}
	
	
}
