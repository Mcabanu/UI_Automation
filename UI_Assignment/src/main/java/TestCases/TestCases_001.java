package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PogeObject.LocatorsOfPages;



public class TestCases_001 {
	
	public static WebDriver driver;
	 public static LocatorsOfPages lp;
	 
	
	public static void openURL() 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(" https://www.tamm.abudhabi/");
	}
	
		
	public static void SelectLanguage()
	{
	    lp= new LocatorsOfPages(driver);
		
		lp.SlectEnglishLan();
      
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       lp.acceptCookies();   
	}


       public static void SelectBusinessType()
       {
    	   
		lp.StartAndManageBusiness();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
       }
	
	
	 public static void verifyBussinesTypePage(){
		boolean verify1= driver.getPageSource().contentEquals("Start & Manage a Business");
		if(verify1=true)
		{
		System.out.println("Verify Start & Manage a business page  is Success"  );
        }
		else
		{
			System.out.println("Failed");
		}
    }
	
       public static void SelectToolAndVerify()
       {
		lp.selectStepbyStep();
	  }
	
	 public static void verifyUserguidePage()
	 {
		boolean verify2= driver.getPageSource().contentEquals("Step-by-Step Business Guide");
		if(verify2=true)
		{
		System.out.println("Verify User guide page is  Success"  );
        }
		else
		{
			System.out.println("Failed");
		}
		
       }
       
	
       public static void VerifyQuestion1()
       {
		boolean question1= driver.getPageSource().contentEquals("What would you like to do?");
		if(question1=true)
		{
			WebElement V1= driver.findElement(By.xpath("//*[@class='ui-lib-radio-group__items']"));
			String content1= V1.getText();
			System.out.println("\n"+"Option of First questions are:");
			System.out.println(content1+"\n");
			
		System.out.println("Verify question No. 1 with all options and its content Success" );
        }
		else
		{
			System.out.println("Failed");
		}
	}
	
	
		 public static void answerQue1()
		 {
		lp.Select1ForQues1();
		System.out.println("Select option1: Get a licence now");
		 }
		 
		 
		 public static void next1() 
		 {
	    	lp.nextForQues1();
		
         }
	
       
	
       public static void VerifyQuestion2()
	{
		boolean question2= driver.getPageSource().contentEquals("Are you planning to open a new company?");
		if(question2=true)
		{
			WebElement V1= driver.findElement(By.xpath("//*[@class='ui-lib-radio-group__items']"));
			String content2= V1.getText();
			System.out.println("\n"+"Option of Second questions are:");
			System.out.println(content2+"\n");
			
		System.out.println("Verify question No.2 with all options and its content Success" );
        }
		else
		{
			System.out.println("Failed");
		}
    	   
	}
	
	
	public static void answerQue2(){
		lp.Select3ForQues2();
		System.out.println("Select option3: No, I want to open a branch for my existing business.");
	}
	
	
	public  static void checkPreviouAnswer_1AndClickNext()
	{
	
		lp.JSExcecuter();
		
		if(driver.getPageSource().contains("Get a licence now"))
		{
			System.out.println("Previous Answer Visible");
		}
	
	else{
		System.out.println("Previous Answer Not Visible");
	   }
	}
	
	
	public static void next2(){
		lp.nextForQues2();
		
       }
       
	
	
       public static void VerifyQuestion3()
	{
		boolean question3= driver.getPageSource().contentEquals("Where is your main business located?");
		if(question3=true)
		{
			WebElement V1= driver.findElement(By.xpath("//*[@class='ui-lib-radio-group__items']"));
			String content3= V1.getText();
			System.out.println("\n" + "Option of Third questions are:");
			System.out.println(content3+"\n");
			
		System.out.println("Verify question No.3 with all options and its content Success" );
        }
		else
		{
			System.out.println("Failed");
		}
	}
	
	
	public static void answerQue3(){
		lp.Select1ForQues3();
		System.out.println("Select option1: Abu Dhabi");
		
	}
	
	
	public static void checkPreviouAnswer_1_2_AndClickNext()
	{
	lp.JSExcecuter();
	if(driver.getPageSource().contains("Get a licence now"))
	{
		System.out.println("Previous Answer Visible");
	}
    else
    {
	System.out.println("Previous Answer Not Visible");
    }
	}
	
	public static void next3()
	{
		lp.nextForQues3();
    }
       
	
       public static void verifyOfLoginpage()
       {
    	  boolean login= driver.getPageSource().contains("Login Required");
    	  System.out.println("Login page is getting displayed");
       }
		
	public static void tearDown()
	{
		driver.quit();
	}
	
	


}