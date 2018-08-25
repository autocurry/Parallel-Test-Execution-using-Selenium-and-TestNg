package TestngPack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
	
	 String message = "Manisha";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @Parameters("myName")
	   @Test(dependsOnMethods={"testPrintMessage"})
	   public void firstest(String _myname) {
	      System.out.println("Inside firsttest()"+_myname);
	      
	   }
		   
	   @Test(dependsOnMethods={"testSalutationMessage"})
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	       
	   }
	   
	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      
	   }
	}

