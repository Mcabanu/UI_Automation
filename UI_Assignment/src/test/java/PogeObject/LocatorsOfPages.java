package PogeObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsOfPages {
	
	WebDriver ldriver;

	  public LocatorsOfPages(WebDriver rdriver)
	  {
		  ldriver=rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	  
	  public void JSExcecuter()
	  {
		  JavascriptExecutor jse = (JavascriptExecutor)ldriver;
		  jse.executeScript("window.scrollBy(0,250)",""); 
	  }
	  
	  @FindBy(linkText="English")
	  WebElement ChooseLan;
	  
	  @FindBy(xpath="//*[@id='TPN-Home']/div[4]/div[3]")
	  WebElement cookies;

	  @FindBy(xpath="//*[@id='content']/div/div[1]/div/div[2]/div/div/div/div/div[3]/a/div/div[1]")
	  WebElement StartAndManage;
	  
	@FindBy(xpath="//*[@id='app']/div/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/a/div[2]/div[1]/div[2]")
	WebElement Tool;  
	
	@FindBy(xpath="//*[@id='uil_radio_button.7']")
	WebElement question1;
	
	@FindBy(xpath="//*[@id='app']/div/div/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div")
	WebElement Next1;
	
	@FindBy(xpath="//*[@id='uil_radio_button.24']")
	WebElement question2;
	
	@FindBy(xpath="//*[@id='app']/div/div/div[3]/div/div[1]/div/div[1]/div/div[1]/div[2]/div/button[2]")
	WebElement Next2;
	
	@FindBy(xpath="//*[@id='uil_radio_button.33']")
	WebElement question3;
	
	@FindBy(xpath="//*[@id='app']/div/div/div[3]/div/div[1]/div/div[1]/div/div[1]/div[2]/div/button[2]")
	WebElement Next3;
	
	
	  public void SlectEnglishLan()
	  {
		  ChooseLan.click();
	  }
	  
	  public void acceptCookies(){
		  cookies.click();
	  }
	  
	  public void StartAndManageBusiness()
	  {
		 JSExcecuter();
		  StartAndManage.click();
	  }
	  
	  
	  public void selectStepbyStep(){
		  Tool.click();
	  }
	  

	  public void Select1ForQues1()
	  {
		  question1.click();
	  }
	  
	  public void nextForQues1(){
		  JSExcecuter();
		  Next1.click();
	  }
	  
	  public void Select3ForQues2()
	  {
		  question2.click();
	  }
	  
	  public void nextForQues2(){
		 // JSExcecuter();
		  Next2.click();
	  }
	  
	  public void Select1ForQues3()
	  {
		  question3.click();
	  }
	  
	  public void nextForQues3(){
		  JSExcecuter();
		  Next1.click();
	  }
	  
	 
}
